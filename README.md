# chessboard

Smallest demonstration that I can do [Clojure](http://clojure.org/) in a modular way.

Imagine that you need a function that, given a representation of a chessboard and a coordinate, returns a basic representation of the piece at the given square. To keep the implementation as simple as possible, we’ll use a vector containing a set of characters corresponding to the colored chess pieces, as shown in the following listing:

```clojure
(def board [
  \r \n \b \q \k \b \n \r
  \p \p \p \p \p \p \p \p
  \- \- \- \- \- \- \- \-
  \- \- \- \- \- \- \- \-
  \- \- \- \- \- \- \- \-
  \- \- \- \- \- \- \- \-
  \P \P \P \P \P \P \P \P
  \R \N \B \Q \K \B \N \R])
```

This data structure in the code corresponds directly to an actual chessboard in the starting position, as shown in figure. Black pieces are lowercase characters and white pieces are uppercase.

![Chessboard](http://img.srigi.sk/chessboard.jpg)

You can name any square on the chessboard using a standard *rank/file* notation—using a letter for the column and a number for the row. For example, `a1` indicates the square at lower left, containing a white rook.

Write a function named `lookup` that returns the contents of a square on the chessboard, given the name of the square in standard *rank/file* notation.

## Usage

Please install [Leiningen](http://leiningen.org/) to run this application. From the root of the project run this command:

```
$> lein run a1
R
```

## TODO
- tests
- command-line parameters check

## License

MIT
