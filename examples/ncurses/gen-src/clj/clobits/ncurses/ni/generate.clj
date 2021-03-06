;; This file is autogenerated -- probably shouldn't modify it by hand
(clojure.core/ns
 clobits.ncurses.ni.generate
 (:require [clobits.patch-gen-class] [clobits.all-targets])
 (:import
  org.graalvm.word.PointerBase
  org.graalvm.nativeimage.c.struct.CField
  org.graalvm.nativeimage.c.CContext
  org.graalvm.nativeimage.c.function.CFunction
  org.graalvm.nativeimage.c.function.CLibrary
  org.graalvm.nativeimage.c.struct.CFieldAddress
  org.graalvm.nativeimage.c.struct.CStruct
  org.graalvm.nativeimage.c.struct.AllowWideningCast
  org.graalvm.nativeimage.c.function.CFunction
  org.graalvm.word.WordFactory
  clobits.wrappers.IVoidPointer
  [org.graalvm.nativeimage.c.type CCharPointer VoidPointer])
 (:gen-class))

(clojure.core/deftype
 Headers
 []
 org.graalvm.nativeimage.c.CContext$Directives
 (getHeaderFiles
  [_]
  ["\"/Users/test/programmering/clojure/clobits/examples/ncurses/gen-src/c/clobits/ncurses.h\""]))

(clobits.patch-gen-class/gen-class-native
 :name
 ^{org.graalvm.nativeimage.c.CContext clobits.ncurses.ni.generate.Headers, org.graalvm.nativeimage.c.function.CLibrary "clobits$ncurses-ni"}
 clobits.ncurses.ni.interop
 :methods
 [^{:static true, :native true}
  [^{org.graalvm.nativeimage.c.function.CFunction {:transition org.graalvm.nativeimage.c.function.CFunction$Transition/NO_TRANSITION, :value "_SHADOWING_free"}}
   free
   [org.graalvm.nativeimage.c.type.VoidPointer]
   void]
  ^{:static true, :native true}
  [^{org.graalvm.nativeimage.c.function.CFunction {:transition org.graalvm.nativeimage.c.function.CFunction$Transition/NO_TRANSITION, :value "_SHADOWING_malloc"}}
   malloc
   [int]
   clobits.wrappers.IVoidPointer]
  ^{:static true, :native true}
  [^{org.graalvm.nativeimage.c.function.CFunction {:transition org.graalvm.nativeimage.c.function.CFunction$Transition/NO_TRANSITION, :value "_SHADOWING_initscr"}}
   initscr
   []
   clobits.wrappers.IVoidPointer]
  ^{:static true, :native true}
  [^{org.graalvm.nativeimage.c.function.CFunction {:transition org.graalvm.nativeimage.c.function.CFunction$Transition/NO_TRANSITION, :value "_SHADOWING_delwin"}}
   delwin
   [org.graalvm.nativeimage.c.type.VoidPointer]
   int]
  ^{:static true, :native true}
  [^{org.graalvm.nativeimage.c.function.CFunction {:transition org.graalvm.nativeimage.c.function.CFunction$Transition/NO_TRANSITION, :value "_SHADOWING_endwin"}}
   endwin
   []
   int]
  ^{:static true, :native true}
  [^{org.graalvm.nativeimage.c.function.CFunction {:transition org.graalvm.nativeimage.c.function.CFunction$Transition/NO_TRANSITION, :value "_SHADOWING_noecho"}}
   noecho
   []
   int]
  ^{:static true, :native true}
  [^{org.graalvm.nativeimage.c.function.CFunction {:transition org.graalvm.nativeimage.c.function.CFunction$Transition/NO_TRANSITION, :value "_SHADOWING_curs_set"}}
   curs_set
   [int]
   int]
  ^{:static true, :native true}
  [^{org.graalvm.nativeimage.c.function.CFunction {:transition org.graalvm.nativeimage.c.function.CFunction$Transition/NO_TRANSITION, :value "_SHADOWING_mvprintw"}}
   mvprintw
   [int int org.graalvm.nativeimage.c.type.CCharPointer]
   int]
  ^{:static true, :native true}
  [^{org.graalvm.nativeimage.c.function.CFunction {:transition org.graalvm.nativeimage.c.function.CFunction$Transition/NO_TRANSITION, :value "_SHADOWING_clear"}}
   clear
   []
   int]
  ^{:static true, :native true}
  [^{org.graalvm.nativeimage.c.function.CFunction {:transition org.graalvm.nativeimage.c.function.CFunction$Transition/NO_TRANSITION, :value "_SHADOWING_getmaxx"}}
   getmaxx
   [org.graalvm.nativeimage.c.type.VoidPointer]
   int]
  ^{:static true, :native true}
  [^{org.graalvm.nativeimage.c.function.CFunction {:transition org.graalvm.nativeimage.c.function.CFunction$Transition/NO_TRANSITION, :value "_SHADOWING_getmaxy"}}
   getmaxy
   [org.graalvm.nativeimage.c.type.VoidPointer]
   int]
  ^{:static true, :native true}
  [^{org.graalvm.nativeimage.c.function.CFunction {:transition org.graalvm.nativeimage.c.function.CFunction$Transition/NO_TRANSITION, :value "_SHADOWING_getmaxyx"}}
   getmaxyx
   [org.graalvm.nativeimage.c.type.VoidPointer int int]
   void]
  ^{:static true, :native true}
  [^{org.graalvm.nativeimage.c.function.CFunction {:transition org.graalvm.nativeimage.c.function.CFunction$Transition/NO_TRANSITION, :value "_SHADOWING_printw"}}
   printw
   [org.graalvm.nativeimage.c.type.CCharPointer]
   int]
  ^{:static true, :native true}
  [^{org.graalvm.nativeimage.c.function.CFunction {:transition org.graalvm.nativeimage.c.function.CFunction$Transition/NO_TRANSITION, :value "_SHADOWING_refresh"}}
   refresh
   []
   int]
  ^{:static true, :native true}
  [^{org.graalvm.nativeimage.c.function.CFunction {:transition org.graalvm.nativeimage.c.function.CFunction$Transition/NO_TRANSITION, :value "_SHADOWING_wrefresh"}}
   wrefresh
   [org.graalvm.nativeimage.c.type.VoidPointer]
   int]])

