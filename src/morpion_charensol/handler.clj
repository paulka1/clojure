(ns morpion-charensol.handler
  (:require
            [morpion-charensol.views :as views]
            [compojure.core :refer :all]
            [compojure.route :as route]
            [ring.middleware.defaults :refer [wrap-defaults site-defaults]])
    (:use [hiccup.core]))

(defroutes app-routes
  (GET "/" [] "Hello World")
  (GET "/new" [] (views/home-page))
  (route/not-found "Not Found"))

(def app
  (wrap-defaults app-routes site-defaults))

