(ns euler.problem-016
  (:require [euler.common :as common]))

(defn sum-binary-power
  [n]
  (->> (reduce * (repeat n 2N))
       str
       (transduce (map #(Character/digit % 10)) +)))

(comment
  (sum-binary-power 1000)
  ;; => 1366
  ,)
