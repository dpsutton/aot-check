(ns entry
  (:require [dep :refer [do-stuff]])
  (:gen-class))

(defn -main [& args]
  (println (do-stuff "hi you've arrived")))
