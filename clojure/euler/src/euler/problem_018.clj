(ns euler.problem-018
  (:require [euler.common :as common]))

(def small-tri
  [[3]
   [7 4]
   [2 4 6]
   [8 5 9 3]])

(def big-tri
  [[75]
   [95 64]
   [17 47 82]
   [18 35 87 10]
   [20  4 82 47 65]
   [19  1 23 75  3 34]
   [88  2 77 73  7 63 67]
   [99 65  4 28  6 16 70 92]
   [41 41 26 56 83 40 80 70 33]
   [41 48 72 33 47 32 37 16 94 29]
   [53 71 44 65 25 43 91 52 97 51 14]
   [70 11 33 28 77 73 17 78 39 68 17 57]
   [91 71 52 38 17 14 91 43 58 50 27 29 48]
   [63 66  4 68 89 53 67 30 73 16 69 87 40 31]
   [04 62 98 27 23  9 70 98 73 93 38 53 60  4 23]])

(defn prune
  [tri]
  (let [top (drop-last 2 tri)
        [r1 r2] (take-last 2 tri)]
    (let [pruned (for [[i n] (map vector (range) r1)]
                   (+ n (->> r2
                             (drop i)
                             (take 2)
                             (apply max))))]
      (conj (vec top) (vec pruned)))))

(defn maximum-total
  [tri]
  (if (= 1 (count tri))
    (ffirst tri)
    (maximum-total (prune tri))))

(comment
  (maximum-total big-tri)
  ;; => 1074
  ,)
