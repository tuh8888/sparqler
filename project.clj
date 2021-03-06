(defproject sparqler "0.1.0-SNAPSHOT"
  :description "SPARQL for Clojure"
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [clj-sparql "0.2.0"]
                 [clj-time "0.13.0"]
                 [criterium "0.4.4"]
		 [joda-time "2.3"]
                 [viebel/codox-klipse-theme "0.0.5"]
                 ]


   :plugins [[lein-codox "0.10.2"] [lein-cljsbuild "1.1.5"]]
  
  :codox {:metadata {:doc/format :markdown}
          :language :clojurescript
          :namespaces [cljstest.core]
          :source-uri "https://raw.githubusercontent.com/UCDenver-ccp/sparqler/master/{filepath}#L{line}"
	  :source-paths ["src"]
	  :output-path "doc"
          :themes [:default [:klipse
                             {:klipse/external-libs "https://raw.githubusercontent.com/UCDenver-ccp/sparqler/master/src"
                              :klipse/require-statement "(ns my.test (:require [cljstest.core :as cljstest :refer [abs testquery]]))"}]]}

  :cljsbuild {
              :builds
              {
               :dev {
                     :source-paths ["src/cljstest"]
                     :compiler {:main "cljstest.test"
                                :asset-path "js"
                                :output-to "resources/public/js/main.js"
                                :output-dir "resources/public/js"
                                :optimizations :none
                                :pretty-print true}}}}
             

  :jvm-opts ["-Xms1024m" "-Xmx1024m"])
