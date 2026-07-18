(ns business-manager.test-runner
  (:require [business-manager.cells.social-post.state-machine]
            [business-manager.methods.social]
            [business-manager.methods.test-agent]
            [clojure.test :as test]))

(defn -main [& _]
  (let [{:keys [fail error]}
        (test/run-tests 'business-manager.methods.test-agent)]
    (when (pos? (+ fail error)) (System/exit 1))))
