(ns store.lesson1)

;Array
["daniel" "rapper" "mapper" "engineer"]

;Map
{"william" 23, "paul" 23}

;Linked List
'(1 2 3 4 5)

;Set
#{1 2 3}

;to print all the elements in array.
(map println ["daniel" "rapper" "mapper" "engineer"])

(println (first ["daniel" "rapper" "mapper" "engineer"]))

(println (rest ["daniel" "rapper" "mapper" "engineer"]))

(println (next ["daniel" "rapper" "mapper" "engineer"]))

(println (first []))

(println (rest []))

(println (next []))

(defn my-map-v1
  [function collection]
  (function (first collection)))

(my-map-v1 println ["daniel" "rapper" "mapper" "engineer"])

(defn my-map-v2
  [function collection]
  (let [first-element (first collection)]
    (if (not (nil? first-element))
      (do
        (function first-element)
        (my-map-v2 function (rest collection))))))

(my-map-v2 println ["daniel" "rapper" "mapper" "engineer"])

(my-map-v2 println ["daniel" false "rapper" "mapper" "engineer"])