(defproject sparqler "0.1.0-SNAPSHOT"
  :description "SPARQL for Clojure"
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [clj-sparql "0.2.0"]
                 [clj-time "0.13.0"]
		 [joda-time "2.3"]
                 [viebel/codox-klipse-theme "0.0.4"]
                 ]
  :plugins [[lein-codox "0.10.3"]]  
  :codox {:metadata {:doc/format :markdown}
          :namespaces [sparqler.core]
          :source-uri "https://github.com/UCDenver-ccp/sparqler/tree/master/{filepath}#L{line}"
         :themes [:default [:klipse
         {:klipse/external-libs
          "https://github.com/UCDenver-ccp/sparqler/tree/master/src"
          :klipse/require-statement
          "(ns sparqler.core
          (:require [sparqler.core :as sparqler :all]))"}]]}
  :target-path "target/%s"
  :jvm-opts ["-Xms1024m" "-Xmx1024m"])
