(ns dep)

(def f
  (if *compile-files*
    (fn [arg]
      (throw (ex-info "shouldn't call `f` at compile time" {:arg arg})))
    str))

(defmacro do-stuff [x]
  `(f ~x))
