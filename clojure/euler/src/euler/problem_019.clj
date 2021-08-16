(ns euler.problem-019
  (:require [euler.common :as common]))

(def days [:mon :tues :wed :thurs :fri :sat :sun])
(def months [:jan :feb :mar :apr :may :jun :jul :aug :sep :oct :nov :dec])

(defn leap?
  [y]
  (or (and (zero? (mod y 4))
           (not (zero? (mod y 100))))
      (zero? (mod y 400))))

(def length-fns
  {:jan (constantly 31)
   :feb (fn [y] (if (leap? y) 29 28))
   :mar (constantly 31)
   :apr (constantly 30)
   :may (constantly 31)
   :jun (constantly 30)
   :jul (constantly 31)
   :aug (constantly 31)
   :sep (constantly 30)
   :oct (constantly 31)
   :nov (constantly 30)
   :dec (constantly 31)})

(def years (range 1901 2001))

(defn month-lengths
  [y]
  (map #((length-fns %) y) months))

(defn year-length
  [y]
  (reduce + (month-lengths y)))

(defn total-days
  [years]
  (reduce + (map year-length years)))

(def all-days (->> (cycle days)
                   (drop 365) ; ignoring 1900
                   (take (total-days years))))

(def all-month-lengths (mapcat month-lengths years))

(defn sunday-firsts
  []
  (->> (reduce (fn [{:keys [remaining-days] :as acc} m]
                 (-> acc
                     (update :firsts conj (first remaining-days))
                     (update :remaining-days #(drop m %))))
               {:remaining-days all-days
                :firsts []}
               all-month-lengths)
       :firsts
       (filter #{:sun})
       count))

(comment
  (sunday-firsts)
  ;; => 171
  ,)
