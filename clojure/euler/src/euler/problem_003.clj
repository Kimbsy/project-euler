(ns euler.problem-003
  (:require [euler.common :as common]))

(defn largest-prime-factor
  [n]
  (->> (range 1 (Math/sqrt n))
       (filter #(and (common/prime? %) (common/factor? n %)))
       (apply max)))

(comment
  (largest-prime-factor 600851475143)
  ;; => 6857
  ,)
