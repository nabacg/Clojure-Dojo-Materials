(ns clojure-dojo-materials.core
  (:gen-class))


(defn my-first-count [coll]
  (if (seq coll)
    (inc (my-first-count (rest coll)))
    0))

(my-first-count (range 10))

(defn my-count-rec [coll]
  (loop [acc 0 cs coll]
    (if (seq cs)
      (recur (inc acc) (rest cs))
      acc)))

(my-count-rec (range 19))

(defn my-pred-count [pred coll]
  (loop [acc 0 cs coll]
    (if (seq cs)
      (recur (if (pred (first cs))
               (inc acc)
               acc)
             (rest cs))
      acc)))

(my-pred-count even? (range 11))

(defn my-hof-count [fold coll]
  (loop [acc 0 lst coll]
    (if (seq lst)
      (recur (fold acc (first lst))
             (rest coll))
      acc)))

(my-hof-count (fn [n i] (inc n)) (range 10))
(my-hof-count #(if (even? %2) (inc %) %) (range 11))

