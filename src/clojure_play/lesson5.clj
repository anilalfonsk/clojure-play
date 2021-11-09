(ns clojure-play.lesson5)

(def storage {"Backpack" 5, "Shirt" 7} )

(println storage)

(println (count storage))

(println (keys storage))

(println (vals storage))

(def bucket {:backpack 10
             :shirt 23})

(println (vals bucket))

(println (assoc bucket :trousers 21))

(println (update bucket :backpack inc))

(defn minus-one
  [value]
  (println "Substracting 1 from " value)
  (- value 1))

(println (update bucket :backpack minus-one))

(println (update bucket :backpack #(- %1 1)))

