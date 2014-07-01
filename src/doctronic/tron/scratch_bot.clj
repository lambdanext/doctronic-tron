(ns doctronic.tron.scratch-bot)

(defn buzz
  [look state]
  (let [[x y] (get state :pos)]
    {:pos [x (inc y)]}))

(defn improved-buzz
  [look state]
  (let [[x y] (get state :pos)]
    (if (nil? (look [(inc x) y]))
      {:pos [(inc x) y]}
      {:pos [x (inc y)]})))
