(ns klipse.run.plugin-prod.plugin
  (:require klipse.core
            klipse.lang.javascript
            klipse.lang.js-compile
            klipse.lang.ruby
            klipse.lang.python
            klipse.lang.scheme
            klipse.lang.php
            klipse.lang.server-eval
            klipse.lang.markdown
            klipse.lang.lambdaway
            klipse.lang.clojure
            klipse.lang.html
            [klipse.plugin :as plugin]))

(print "settings: " (aget js/window "klipse_settings"))
(defn ^:export settings []
  (aget js/window "klipse_settings"))

(plugin/init (settings))
