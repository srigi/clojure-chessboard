(ns chessboard.lookup-components)


(defn file [file]
  (- (int file) (int \a)))


(defn rank [rank]
  (->> (int \0)
       (- (int rank))
       (- 8)
       (* 8)))
