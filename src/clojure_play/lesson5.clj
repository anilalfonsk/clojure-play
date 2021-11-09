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

(println (dissoc bucket :backpack))

(def order {:backpack {
                       :quantity 2,
                       :price 80
                       },
            :shirt {
                    :quantity 2
                    :price 40
                    }})

(println order)

(assoc order :keychain {
                         :quantity 1,
                         :price 10
                         })

(def order (assoc order :keychain {
                                   :quantity 1,
                                   :price 10
                                   }))

(println order)

(println (get order :backpack))
(println (get order :cheer))
(println (get order :cheer {}))

; Preferred way to get data is as follows
(println (:backpack order))
(println (:cheer order {}))
(println (:quantity (:backpack order)))
(println (update-in order [:backpack :quantity] inc))

;MOST USED AND PREFERRED WAY IS AS FOLLOWS
;Its also treated as Threading
(println (-> order
             :backpack
             :quantity))

;this is called threading and is extensively used in the clojure coding
(-> order :backpack :quantity println)

(def clients {
              :15 {
                   :name "william"
                   :certificates ["ONE" "TWO" "THREE" "FOUR"]
                   }
              })

(println (count (-> clients :15 :certificates)))


