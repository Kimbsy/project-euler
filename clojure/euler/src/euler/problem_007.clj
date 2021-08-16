(ns euler.problem-007
  (:require [euler.common :as common]))

(defn nth-prime
  [n]
  (->> (range)
       (filter common/prime?)
       (#(nth % (dec n)))))

(comment
  (nth-prime 10001)
  ;; => 104743
  ,)
