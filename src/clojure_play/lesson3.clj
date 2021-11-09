(ns clojure-play.lesson3)

(defn discounted-price
  "Returns discounted price which is % of orignial"
  [orignialPrice, percentage]
  (if (apply-discount? orignialPrice)  (let [discount_limit 100 discount_rate (/ percentage discount_limit)]
    (* orignialPrice
       (- 1 discount_rate))) orignialPrice))

(println (discounted-price 1000 10))
(println (discounted-price 100 10))

(defn apply-discount?
  "Checks if the discount should be applied"
  [original-price]
  (if (> original-price 100) true false) )

(defn apply-discount-when?
  [original-price]
  (when (> original-price 100) true))

(defn apply-discount-refactored?
  "Apply discount refactored"
  [original-price]
   (> original-price 100))

(println (apply-discount? 1000))
(println (apply-discount? 100))
(println (apply-discount-refactored? 1000))
(println (apply-discount-when? 1000))
(println (apply-discount-when? 100))

(defn more-expensive-than-100?
  [original-price]
  (> original-price 100))

(defn discounted-price-with-lambda-function
  "Discounted price calculation with a lambda function"
  [willapply? orignialPrice, percentage]
  (if (willapply? orignialPrice)  (let [discount_limit 100 discount_rate (/ percentage discount_limit)]
                                         (* orignialPrice
                                            (- 1 discount_rate))) orignialPrice))

(println (discounted-price-with-lambda-function more-expensive-than-100?, 1000, 10))

(fn [name]
  (println "hello " name))

(fn [original-price] (> original-price 100))

(println (discounted-price-with-lambda-function (fn [original-price] (> original-price 100)), 1000, 10))
(println (discounted-price-with-lambda-function (fn [original-price] (> original-price 100)), 100, 10))

;Some more syntax sugar

(println (discounted-price-with-lambda-function #(> %1 100), 1000, 10))
(println (discounted-price-with-lambda-function #(> %1 100), 100, 10))

