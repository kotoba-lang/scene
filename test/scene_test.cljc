(ns scene-test
  (:require [clojure.test :refer [deftest is testing]]
            [scene]))
(deftest namespace-loads
  (testing "the restored CLJC namespace loads"
    (is (some? scene))))
