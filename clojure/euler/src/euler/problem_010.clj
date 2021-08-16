(ns euler.problem-010
  (:require [euler.common :as common]))

(defn sum-primes-below
  [n]
  (transduce (comp (filter common/prime?)
                   (take-while #(< % n)))
             +
             (range)))

(comment
  (sum-primes-below 2000000)
  ;; => 142913828922
  ,)
