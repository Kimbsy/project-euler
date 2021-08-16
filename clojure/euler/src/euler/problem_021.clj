(ns euler.problem-021
  (:require [euler.common :as common]))

(def divisors
  (memoize
   (fn [n]
     (->> (range 1 n)
          (filter #(common/factor? n %))))))

(def amicable?
  (memoize
   (fn [a b]
     (and (not= a b)
          (= (reduce + (divisors a)) b)
          (= (reduce + (divisors b)) a)))))

(defn sum-amicables
  []
  (->> (for [i (range 1 10000)]
         (when (amicable? i (reduce + (divisors i))) i))
       (filter some?)
       (reduce +)))

(comment
  (sum-amicables)
  ;; => 31626
  ,)
