Clojure-Dojo-Materials
======================

Useful materials for our internal Clojure Dojo

Higher Order Functions
def
Higher Order Function is a function that takes one or more functions as input argument or returns a function as it's result.

Example

`(defn twice [fun x] (-> x fun fun))`



Task
Implement Count, Sum, Map, Filter, Remove using only core Clojure functions.

Count, Pred-Count

1. Naive Recursion 
2. Using loop-recur to address lack of TCO
3. Implementing using another higher order, i.e. reduce


Sum

Map

Filter
