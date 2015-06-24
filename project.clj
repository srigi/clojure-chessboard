(defproject chessboard "0.1.0-SNAPSHOT"
  :description "Smallest demonstration that Srigi can do Clojure in a modular way"
  :license {
    :name "MIT"
    :url "http://opensource.org/licenses/MIT"}
  :dependencies [
    [org.clojure/clojure "1.6.0"]]
  :main ^:skip-aot chessboard.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
