(ns training.env
  (:require
    [selmer.parser :as parser]
    [clojure.tools.logging :as log]
    [training.dev-middleware :refer [wrap-dev]]))

(def defaults
  {:init
   (fn []
     (parser/cache-off!)
     (log/info "\n-=[training started successfully using the development profile]=-"))
   :stop
   (fn []
     (log/info "\n-=[training has shut down successfully]=-"))
   :middleware wrap-dev})
