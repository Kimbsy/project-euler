(ns euler.problem-008
  (:require [euler.common :as common]))

(defn greatest-n-digit-product
  [n]
  (->> (clojure.string/replace (slurp "resources/problem-008.txt") #"\n" "")
       (partition n 1)
       (map (fn [ds]
              (transduce (map #(Character/digit % 10))
                         *
                         ds)))
       (apply max)))

(comment
  (greatest-n-digit-product 13)
  ;; => 23514624000
  ,)
