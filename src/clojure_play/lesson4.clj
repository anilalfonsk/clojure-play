(ns clojure-play.lesson4)

(def prices [10000 100000 100])

(println "getting value using GET function")
(println (get prices 10))
;(println (prices 10))// this will return exception
; GET method can also specify default value if it does not exist
(println (get prices 100 10))
(println (conj prices 5))
;(println (conj 5 prices))
(println prices)

(defn add+1
  "To add 1 to passed value"
  [value]
   (+ value 1)
  )

(println (add+1 (prices 0)))

(println (update  prices 0 #(+ %1 4)))






(defn applies-discount?
  [original-price]
  (> original-price 100))

(defn discounted-price
  "Returns discounted price"
  [original-price]
  (if (applies-discount? original-price)
    (let [discount-rate (/ 10 100)
          discount (* original-price discount-rate)]
      (- original-price discount)) original-price))


(println (map discounted-price prices))

(println (range 10))

(println (filter even? (range 10)))

(println (map discounted-price (filter applies-discount? prices)))

(println (reduce + prices))

(defn my-sum
  [value1 value2]
  (println "Adding value1 " value1 "with value " value2)
  (+ value1 value2))

(println (reduce my-sum (range 10)))
