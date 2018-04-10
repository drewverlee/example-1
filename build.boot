(set-env!
 :dependencies '[[seancorfield/boot-tools-deps "0.4.5"]
                 [adzerk/boot-test "1.2.0" :scope "test"]]
 :source-paths #{"test"})


(require
 '[adzerk.boot-test :as boot-test]
 '[boot-tools-deps.core :refer [deps]])


(deftask test
  "Runs tests"
  []
  (comp (deps :aliases [:test])
        (boot-test/test)))


(deps :config-data "deps.edn" :quick-merge true)

(deftask hi
  "Runs tests"
  [] (println "hello"))
