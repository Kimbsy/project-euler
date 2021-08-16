(ns euler.problem-67
  (:require [euler.common :as common]
            [euler.problem-018 :as p18]))

(defn maximum-total-huge
  []
  (->> (clojure.string/split (slurp "resources/problem-067.txt") #"\n")
       (map (fn [s]
              (->> (clojure.string/split s #" ")
                   (map #(Integer/parseInt %)))))
       (mapv vec)
       p18/maximum-total))

(comment
  (maximum-total-huge)
  ;; => 7273
  ,)
