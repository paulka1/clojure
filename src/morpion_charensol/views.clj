(ns morpion-charensol.views
    (:require
      [clojure.string :as str]
      [hiccup.page :as page]
      [ring.util.anti-forgery :as util]))

(defn gen-page-head
      [title]
      [:head
       [:title (str "Locations: " title)]
       (page/include-css "/css/styles.css")])

(def header-links
  [:div#header-links
   " | "
   [:a {:href "/new"} "new game"]
   " | "
   [:a {:href "/new"} "1vs1"]
   " | "
   [:a {:href "/game_machine"} "1vsMachine"]
   " ]"])

(defn home-page
      []
      (page/html5
        (gen-page-head "MORPION")
        header-links
        [:h1 "MORPION"]
        [:div#playerLine[:h3.player "Player 1"] [:h3.player "Player 2"]]
        ))

