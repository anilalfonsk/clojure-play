(defn print-message[]
    (println "Welcom to our storage!")
    (println "---------------------"))

(defn discounted-price
    "Returns discounted price which is % of orignial"
    [orignialPrice, percentage]
    (let [discount_limit 100 discount_rate (/ percentage discount_limit)]
    (* orignialPrice 
        (- 1 discount_rate))))

(println (discounted-price 1000 10))