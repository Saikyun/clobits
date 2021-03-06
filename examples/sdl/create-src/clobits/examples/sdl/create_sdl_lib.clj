(ns clobits.examples.sdl.create-sdl-lib
  (:require [clojure.string :as str]
            [clobits.parse-c :as pc] 
            [clobits.core :as cc]
            
            [clojure.pprint :refer [pp pprint]]))

(def lib-name 'clobits.sdl)

(def functions
  ["int GET_SDL_INIT_VIDEO() { return SDL_INIT_VIDEO; }"
   
   "int GET_SDL_WINDOW_SHOWN() { return SDL_WINDOW_SHOWN; }"
   
   "void* get_null() { return NULL; }"
   
   "char *gen_title() { return \"Clobits SDL Example\"; }"
   
   "
SDL_Rect *create_rect(int x, int y, int w, int h) {
  SDL_Rect *r = (SDL_Rect*)malloc(sizeof(SDL_Rect));
  r->x = x;
  r->y = y;
  r->w = w;
  r->h = h;
  return r;
}"
   
   "
SDL_Event e;

SDL_Event *get_e() {
  return &e;
}"])

(def prototypes
  ["int SDL_Init(Uint32 flags)"
   "int SDL_PollEvent(SDL_Event* event)"
   "void SDL_Delay(Uint32 ms)"
   "int SDL_UpdateWindowSurface(SDL_Window* window)"
   "SDL_Surface* SDL_GetWindowSurface(SDL_Window* window)"
   
   "
Uint32 SDL_MapRGB(const SDL_PixelFormat* format,
                  Uint8                  r, 
                  Uint8                  g, 
                  Uint8                  b)
"
   
   "
SDL_Window* SDL_CreateWindow(const char* title,
                             int         x,
                             int         y,
                             int         w,
                             int         h,
                             Uint32      flags)
"
   
   "
int SDL_FillRect(SDL_Surface*    dst,
                 const SDL_Rect* rect,
                 Uint32          color)
"])

(def structs
  {"SDL_Event" {:clj-sym 'SDL_Event
                :c-sym "SDL_Event"
                :attrs [{:sym "type" :type "int"}
                        {:sym "key" :type "SDL_KeyboardEvent"}]}
   "SDL_KeyboardEvent" {:clj-sym 'SDL_KeyboardEvent
                        :c-sym "SDL_KeyboardEvent"
                        :attrs [{:sym "keysym"
                                 :type "SDL_Keysym"}]}
   "SDL_Keysym" {:clj-sym 'SDL_Keysym
                 :c-sym "SDL_Keysym"
                 :attrs [{:sym "sym" :type "int"}]}
   "SDL_Surface" {:clj-sym 'SDL_Surface
                  :c-sym "SDL_Surface"
                  :attrs [{:sym "format" :type "SDL_PixelFormat" :pointer "*"}]}
   "SDL_PixelFormat" {:clj-sym 'SDL_PixelFormat
                      :c-sym "SDL_PixelFormat"
                      :attrs [{:sym "palette" :type "void" :pointer "*"}]}
   "SDL_Rect" {:clj-sym 'SDL_Rect
               :c-sym "SDL_Rect"
               :attrs [{:sym "x" :type "Sint16"}
                       {:sym "y" :type "Sint16"}
                       {:sym "w" :type "Uint16"}
                       {:sym "h" :type "Uint16"}]}})

(def typing (merge
             cc/default-typing
             (cc/generate-struct-typing {:lib-name lib-name, :prefixes ["SDL_"]} (map key structs))
             {"SDL_Window" cc/void-pointer-type}))

(def opts
  (let [opts {:inline-c (str/join "\n" functions)
              :protos (concat (map pc/parse-c-prototype functions)
                              (map pc/parse-c-prototype prototypes) ;; utility function for turning c-prototypes into clojure data
                              [{:ret "void", :sym "SDL_Quit"}] ;; we can also just provide the data manually
                              )
              
              :structs structs
              :includes ["stdio.h" "SDL2/SDL.h"]
              :typing typing
              :lib-name lib-name
              :c-src-dir "examples/sdl/gen-src/c"
              :src-dir "examples/sdl/gen-src/clj"
              :java-src-dir "examples/sdl/gen-src/java"
              :lib-dir "libs"
              :libs ["SDL2"]}]
    (merge opts (cc/generate-lib-names opts))))

(defn -main
  []
  (cc/gen-and-persist! opts)
  
  (when-not (System/getenv "REPLING")
    (shutdown-agents) ;; see https://clojure.atlassian.net/browse/CLJ-124
    ))

(when (System/getenv "REPLING")
  (-main)
  (load-file "example-src/clobits/sdl/poly.clj")
  #_  (load-file "test-src/test_examples.clj"))
