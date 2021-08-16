(ns euler.problem-013
  (:require [euler.common :as common]))

(defn problem-13
  []
  (->> (clojure.string/split (slurp "resources/problem-013.txt") #"\n")
       (transduce (map read-string) +)
       str
       (take 10)
       (apply str)
       read-string))

(comment
  (problem-13)
  ;; => 5537376230
  ,)
