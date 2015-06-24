(ns chessboard.lookup
  (:require [chessboard.lookup-components :as components]))



(defn lookup [board pos]
  (let [[file rank] pos]
    (board (+ (components/file file) (components/rank rank)))))


(defn lookup3 [board pos]
  (let [[file rank] (map int pos)
        [fc rc]     (map int [\a \0])
        f (- file fc)
        r (* 8 (- 8 (- rank rc)))
        index (+ f r)]
    (board index)))
