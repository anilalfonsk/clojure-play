(ns clojure-play.lesson6)

(def order {:backpack {
                       :quantity 2,
                       :price 80
                       },
            :shirt {
                    :quantity 2
                    :price 40
                    }})

(defn print-value-returns-15
  [value]
  (println "value" value (class value))
  15)
(println (map print-value-returns-15 order))


(defn print-value-returns-15
  [[key value]]
  (println "key" key "& value" value )
  value)

(println (map print-value-returns-15 order))

(defn total-price-per-product
  [[key value]]
  (* (:quantity value) (:price value)))

(println (map total-price-per-product order))

(println "Total price of all order " (reduce + (map total-price-per-product order)))

(defn total-price-per-product
  [[_ value]]
  (* (:quantity value) (:price value)))

(defn total-price-of-order
  [order]
  (reduce + order))

(println "Total price per order" (total-price-of-order (map total-price-per-product order)))

;Thread last, mean symbol comes last of all the arguments
;usually when we thread like -> order :backpack ,,, :quantity ,,, arguments comes where ,,, is to make argument comes
;at last we the thread last symbol ->>
(defn total-price-order
  [order]
  (->> order
      (map total-price-per-product)
      (reduce +)))

(println "Total price per order " (total-price-order order))


(defn total-price-order
  [order]
  (->> order
       vals
       (map total-price-per-product)
       (reduce +)))