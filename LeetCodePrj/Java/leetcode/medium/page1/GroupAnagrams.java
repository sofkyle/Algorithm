package leetcode.medium.page1;

import java.util.*;

public class GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> res = new ArrayList<>();
        Map<String, Integer> map = new HashMap<>();

        int i = 0;
        for (String s : strs) {
            char[] chars = s.toCharArray();
            Arrays.sort(chars);

            String key = String.valueOf(chars);
            if (!map.containsKey(key)) {
                res.add(new ArrayList<>());
                map.put(key, i++);
            }
            res.get(map.get(key)).add(s);
        }

        return res;
    }
}
