(ns euler.problem-004
  (:require [euler.common :as common]))

(defn largest-palidrome-product
  []
  (->> (for [i (range 1 999)
             j (range 1 999)]
         (* i j))
       (filter (comp common/palindrome? str))
       (apply max)))

(comment
  (largest-palidrome-product)
  ;; => 906609
  ,)
