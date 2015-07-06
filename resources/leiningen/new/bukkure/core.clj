 (ns {{ns-name}}.core
   (:require [bukkure.logging :as log]))

(defonce plugin (atom nil))

(defn on-enable [plugin-instance]
  (log/info "Starting your new bukkure plugin!")
  (reset! plugin plugin-instance))

(defn on-disable [plugin]
  (log/info "Stopping your new bukkure plugin!"))
