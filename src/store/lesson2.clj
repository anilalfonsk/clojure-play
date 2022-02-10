(ns store.lesson2)

(def my-array ["daniel" "william" "carl" "paul" "lucy" "anna"])

(println my-array)

(defn my-counting
  [total-so-far elements]
  (if (seq elements)
    (recur (inc total-so-far) (next elements))
    (println total-so-far)))

(my-counting 0 my-array)

;;Following is a way to have same function name with multiple arguments.
;;Rather than the type the number decided which function to call
(defn my-function
  ([param1]
   (println param1))

  ([param1 param2]
   (println param2)
   (my-function param1)))

(my-function 100)
(my-function 100 200)

;;Rewriting my counting with default arguments
(defn my-counting
  ([total-so-far elements]
   (if (seq elements)
     (recur (inc total-so-far) (next elements))
     (println total-so-far)))

  ([elements]
   (my-counting 0 elements))
  )

(my-counting my-array)

(println "Rewriting counting function using loop")
(defn my-counting-2
  [elements]
  (println "Before the loop")
  (loop
    [total-so-far 0
     remaining-elements elements]
    (if (seq elements)
      (recur (inc total-so-far) (next remaining-elements))
      total-so-far)))

(println (my-counting-2 my-array))