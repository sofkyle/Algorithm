package leetcode.hard.page2;

import java.util.*;

public class LFUCache {
    // <Key, Value>
    HashMap<Integer, Integer> vals;
    // <Key, Counts>
    HashMap<Integer, Integer> counts;
    // <Counts, Key LinkedList>
    HashMap<Integer, LinkedHashSet<Integer>> lists;
    int capacity;
    int min = 1;

    public LFUCache(int capacity) {
        this.capacity = capacity;
        vals = new HashMap<>();
        counts = new HashMap<>();
        lists = new HashMap<>();
        lists.put(1, new LinkedHashSet<>());
    }

    public int get(int key) {
        if (!vals.containsKey(key)) return -1;

        int oldCount = counts.get(key);
        counts.put(key, oldCount + 1);
        if (oldCount == min && lists.get(oldCount).size() == 1) {
            min = oldCount + 1;
        }
        lists.get(oldCount + 1).add(key);

        return vals.get(key);
    }

    public void set(int key, int value) {
        if (vals.containsKey(key) || vals.size() < capacity) {
            vals.put(key, value);
            counts.put(key, counts.get(key) + 1);
            lists.get(counts.get(key)).add(key);
        } else {
            int removeKey = lists.get(min).iterator().next();
            vals.remove(removeKey);
            counts.remove(removeKey);
            lists.get(min).remove(lists.get(min).iterator().next());
        }
    }
}
