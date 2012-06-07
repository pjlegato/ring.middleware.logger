(defproject net.likestream/ring.middleware.logger "0.2.1"
  :description "Ring middleware to log each request using Log4J."

  :repositories {"mvnrepository" "http://mvnrepository.com/"
                 "likestream" "http://maven.likestream.net/maven2/"}
  
  :dependencies [[org.clojure/clojure "1.2.1"]
                 [org.slf4j/slf4j-log4j12 "1.6.4"]
                 [log4j "1.2.17"]
                 [org.clojure/tools.logging "0.2.3"]
                 [clj-logging-config "1.9.6"]
                 [net.likestream/clansi "1.2.1"]
                 ])