package leetcode.hard.page2;

import java.util.*;

public class LFUCache {
    // <Key, Value>
    HashMap<Integer, Integer> vals;
    // <Key, Counts>
    HashMap<Integer, Integer> counts;
    // <Counts, Key LinkedList>
    HashMap<Integer, LinkedHashSet<Integer>> order;
    int capacity;
    int min = 1;

    public LFUCache(int capacity) {
        this.capacity = capacity;
        vals = new HashMap<>();
        counts = new HashMap<>();
        order = new HashMap<>();
        order.put(1, new LinkedHashSet<>());
    }

    public int get(int key) {
        if (!vals.containsKey(key)) return -1;

        int oldCount = counts.get(key);
        counts.put(key, oldCount + 1);
        order.get(oldCount).remove(key);
        if (oldCount == min && order.get(oldCount).size() == 0) {
            min = oldCount + 1;
        }
        if (!order.containsKey(oldCount + 1)) {
            order.put(oldCount + 1, new LinkedHashSet<>());
        }
        order.get(oldCount + 1).add(key);

        return vals.get(key);
    }

    public void put(int key, int value) {
        if (capacity == 0) return;
        if (vals.containsKey(key) || vals.size() < capacity) {
            vals.put(key, value);
            int oldCount = counts.getOrDefault(key, 0);
            counts.put(key, oldCount + 1);

            if (!order.containsKey(oldCount + 1)) {
                order.put(oldCount + 1, new LinkedHashSet<>());
            }
            order.get(oldCount + 1).add(key);
            if (oldCount == 0) {
                min = 1;
            } else {
                order.get(oldCount).remove(key);
                if (oldCount == min && order.get(oldCount).size() == 0) {
                    min = oldCount + 1;
                }
            }
        } else {
            // evict
            int removeKey = order.get(min).iterator().next();
            vals.remove(removeKey);
            counts.remove(removeKey);
            order.get(min).remove(removeKey);


            min = 1;
            vals.put(key, value);
            counts.put(key, min);
            if (!order.containsKey(min)) {
                order.put(min, new LinkedHashSet<>());
            }
            order.get(min).add(key);
        }
    }
}
