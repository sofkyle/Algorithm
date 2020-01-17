package leetcode.medium.page1;

import java.util.*;

public class GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> res = new ArrayList<>(strs.length);
        int count = 0;

        int[] flag = new int[strs.length];

        for (int i = 0; i < strs.length; i++) {
            if (flag[i] == 1) {
                continue;
            }
            List<String> curGroup = new LinkedList<>();
            curGroup.add(strs[i]);

            Map<Character, Integer> iFeature = new HashMap<>(strs[i].length());
            for (int f = 0; f < strs[i].length(); f++) {
                iFeature.put(strs[i].charAt(f), iFeature.getOrDefault(strs[i].charAt(f), 0) + 1);
            }

            for (int j = i + 1; j < strs.length; j++) {
                if (strs[i].length() != strs[j].length()) {
                    continue;
                }

                boolean sameGroup = true;
                Map<Character, Integer> jFeature = new HashMap<>(strs[j].length());
                for (int f = 0; f < strs[j].length(); f++) {
                    jFeature.put(strs[j].charAt(f), jFeature.getOrDefault(strs[j].charAt(f), 0) + 1);
                }

                if (iFeature.size() != jFeature.size()) {
                    sameGroup = false;
                } else {
                    for (Map.Entry entry : iFeature.entrySet()) {
                        if (jFeature.get(entry.getKey()) != entry.getValue()) {
                            sameGroup = false;
                            break;
                        }
                    }
                }

                if (sameGroup) {
                    curGroup.add(strs[j]);
                    flag[j] = 1;
                }
            }

            res.add(curGroup);
            count++;
        }

        return res;
    }
}
