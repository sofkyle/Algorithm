package leetcode.easy.page3;

import java.util.HashMap;
import java.util.Map;

public class LongestPalindrome {
    public int longestPalindrome(String s) {
        Integer result = 0;

        Map<Character, Integer> countMap = new HashMap<>(128);
        for (Character c : s.toCharArray()) {
            if (!countMap.containsKey(c)) {
                countMap.put(c, 1);
            } else {
                countMap.put(c, countMap.get(c) + 1);
            }
        }

        Boolean hasSingle = false;
        for (Map.Entry<Character, Integer> entry : countMap.entrySet()) {
            if (entry.getValue() > 0) {
                if (!hasSingle && entry.getValue() % 2 != 0) {
                    hasSingle = true;
                }
                result += entry.getValue() / 2;
            }
        }

        return hasSingle ? result * 2 + 1 : result * 2;
    }
}
