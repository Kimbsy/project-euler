(ns euler.problem-005
  (:require [euler.common :as common]))

(defn all-divisible
  [n]
  (fn [i]
    (every? #(common/factor? i %)
            (range 1 n))))

(defn smallest-multiple
  [n]
  (->> (range)
       (map inc)
       (filter (all-divisible n))
       first))

(comment
  (smallest-multiple 20)
  ;; => 232792560
  ,)
