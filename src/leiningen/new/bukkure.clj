(ns leiningen.new.bukkure
  (:require [leiningen.new.templates :refer [renderer name-to-path sanitize-ns ->files]]
            [leiningen.core.main :as main]))

(def render (renderer "bukkure"))

(defn bukkure
  "FIXME: write documentation"
  [name]
  (let [data {:name name
              :sanitized (name-to-path name)
              :ns-name (sanitize-ns name)}]
    (main/info "Generating fresh 'lein new' bukkure project.")
    (->files data
             ["src/plugin.yml" (render "plugin.yml" data)]
             ["src/config.yml" (render "config.yml" data)]
             ["src/{{sanitized}}/core.clj" (render "core.clj" data)]
             [".gitignore" (render "gitignore" data)]
             ["javasrc/BukkurePlugin.java" (render "BukkurePlugin.java" data)]
             ["project.clj" (render "project.clj" data)])))
