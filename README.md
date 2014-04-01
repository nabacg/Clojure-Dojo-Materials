Clojure-Dojo-Materials
======================

Useful materials for our internal Clojure Dojo

Higher Order Functions

Definition
Higher Order Function is a function that takes one or more functions as input argument or returns a function as it's result.

Example

`(defn twice [fun x] (-> x fun fun))`

Why useful?
They allow to implement common programming idioms (loops, conditionals) in higher order functions instead of as language features itself. Every loop can be implemented as catamorphism (fold, reduce) or anamorphism (iterate). Useful for DSLs or reusable logic as the allow great way to build flexible abstractions. 

Example
sorting

`(sort > (range 10))`

`(sort-by #(if (odd? %) -1 1) (range 10))`


Task
Implement Count, predicate-count, Sum, Map, Filter, Remove using only core Clojure functions.

Count, Pred-Count

1. Naive Recursion 
2. Using loop-recur to address lack of TCO
3. Implementing using another higher order, i.e. reduce

Futher tasks
1. 4 Clojure problem 55, 56, 60


