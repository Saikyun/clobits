;; This file is autogenerated -- probably shouldn't modify it by hand
(clojure.core/ns
 clobits.ncurses.ni
 (:import clobits.wrappers.IWrapperNI)
 (:gen-class))

(clojure.core/defn
 free
 
 [^clobits.wrappers.IWrapperNI ptr]
 (clobits.ncurses.ni.interop/free (.unwrap ptr)))

(clojure.core/defn
 malloc
 ^clobits.wrappers.WrapVoid
 [^long size]
 (new clobits.wrappers.WrapVoid
  (clobits.ncurses.ni.interop/malloc size)))

(clojure.core/defn
 initscr
 ^clobits.wrappers.WrapVoid
 []
 (new clobits.wrappers.WrapVoid (clobits.ncurses.ni.interop/initscr)))

(clojure.core/defn
 delwin
 ^long
 [^clobits.wrappers.IWrapperNI win]
 (clobits.ncurses.ni.interop/delwin (.unwrap win)))

(clojure.core/defn endwin ^long [] (clobits.ncurses.ni.interop/endwin))

(clojure.core/defn noecho ^long [] (clobits.ncurses.ni.interop/noecho))

(clojure.core/defn
 curs-set
 ^long
 [^long visibility]
 (clobits.ncurses.ni.interop/curs-set visibility))

(clojure.core/defn
 mvprintw
 ^long
 [^long y ^long x ^clobits.wrappers.IWrapperNI fmt]
 (clobits.ncurses.ni.interop/mvprintw y x (.unwrap fmt)))

(clojure.core/defn clear ^long [] (clobits.ncurses.ni.interop/clear))

(clojure.core/defn
 getmaxx
 ^long
 [^clobits.wrappers.IWrapperNI win]
 (clobits.ncurses.ni.interop/getmaxx (.unwrap win)))

(clojure.core/defn
 getmaxy
 ^long
 [^clobits.wrappers.IWrapperNI win]
 (clobits.ncurses.ni.interop/getmaxy (.unwrap win)))

(clojure.core/defn
 getmaxyx
 
 [^clobits.wrappers.IWrapperNI win ^long y ^long x]
 (clobits.ncurses.ni.interop/getmaxyx (.unwrap win) y x))

(clojure.core/defn
 printw
 ^long
 [^clobits.wrappers.IWrapperNI arg0]
 (clobits.ncurses.ni.interop/printw (.unwrap arg0)))

(clojure.core/defn
 refresh
 ^long
 []
 (clobits.ncurses.ni.interop/refresh))

(clojure.core/defn
 wrefresh
 ^long
 [^clobits.wrappers.IWrapperNI win]
 (clobits.ncurses.ni.interop/wrefresh (.unwrap win)))
