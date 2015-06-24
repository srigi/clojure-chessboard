(ns chessboard.core
  (:gen-class)
  (:require [chessboard.lookup :refer [lookup lookup3]] :reload))


(def board [
  \r \n \b \q \k \b \n \r
  \p \p \p \p \p \p \p \p
  \- \- \- \- \- \- \- \-
  \- \- \- \- \- \- \- \-
  \- \- \- \- \- \- \- \-
  \- \- \- \- \- \- \- \-
  \P \P \P \P \P \P \P \P
  \R \N \B \Q \K \B \N \R])


(defn -main [& args]
  (println (lookup board (first args))))
