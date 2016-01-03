(defproject {{name}} "0.1.0-SNAPSHOT"
  :description "A bukkure plugin to..."
  :dependencies [[org.clojure/clojure "1.7.0"]
                 [bukkure "0.4.2-SNAPSHOT"]]
  :repositories [["spigot-repo" "https://hub.spigotmc.org/nexus/content/groups/public/"]]
  :profiles {:provided
             {:dependencies [[org.bukkit/bukkit "1.8.8-R0.1-SNAPSHOT"]]}}
  :java-source-paths ["javasrc"])
