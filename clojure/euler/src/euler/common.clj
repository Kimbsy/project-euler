(ns euler.common)

(defn prime?
  [n]
  (or (= 2 n)
      (and (< 1 n)
           (not-any? #(= 0 (rem n %)) (range 2 (inc (Math/sqrt n)))))))

(defn factor?
  [n m]
  (zero? (rem n m)))

(defn palindrome?
  [s]
  (= (seq s) (reverse s)))
