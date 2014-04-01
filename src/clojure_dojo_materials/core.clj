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


(defn my-sum [coll]
  (loop [acc 0 lst coll]
    (if (seq lst)
      (recur (+ (first lst) acc) (rest lst))
      acc)))

(my-sum (range 10))

(defn my-filter [pred coll]
  (loop [acc [] lst coll]
    (if (seq lst)
      (recur (if (pred (first lst))
               (conj acc (first lst))
               acc)
             (rest lst))
      acc)))

(my-filter even? (range 11))

(defn my-remove [pred coll]
  (loop [acc [] lst coll]
    (if (seq lst)
      (recur (if (pred (first lst))
               acc
               (conj acc (first lst)))
             (rest lst))
      acc)))

(my-remove even? (range 11))

(defn my-reduce
  ([fold-fn coll] (my-reduce fold-fn (fold-fn (first coll)) (rest coll)))
  ([fold-fn init coll]
     (loop [acc init lst coll]
       (if (seq lst)
         (recur (fold-fn acc (first lst))
                (rest lst))
         acc))))

(my-reduce + (range 3))
(my-reduce * (range 1 7))

(defn my-map [fun coll]
  (loop [acc [] lst coll]
    (if (seq lst)
      (recur (conj acc (fun (first lst)))
             (rest lst))
      (seq acc))))

(my-map first {:a 5 :b 23})


(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "Hello, World!"))