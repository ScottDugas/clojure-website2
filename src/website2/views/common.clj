(ns website2.views.common
  (:use [noir.core :only [defpartial]]
        [hiccup.page-helpers :only [include-js include-css html5]]))

(defpartial layout [& content]
            (html5
              [:head
               [:title "website2"]
               (include-css "/css/reset.css")]
              [:body
               [:div#wrapper
                content]]))

(defpartial site-layout [& content]
  (html5
   [:head
    [:title "my website2"]
    (include-js "/js/main.js")]
   [:body
    [:div#wrapper
     content]]))