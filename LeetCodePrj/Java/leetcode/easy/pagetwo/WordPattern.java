package leetcode.easy.pagetwo;

import java.util.HashMap;
import java.util.Map;

public class WordPattern {
    public boolean wordPattern(String pattern, String str) {
        Map<Character, String> map = new HashMap<>();

        String[] strArray = str.split(" ");

        if (pattern.length() != strArray.length) return false;

        for (int i = 0; i < pattern.length(); i++) {
            if (!map.containsKey(pattern.charAt(i)) && !map.containsValue(strArray[i])) {
                map.put(pattern.charAt(i), strArray[i]);
            } else {
                if (map.get(pattern.charAt(i)) != null && !map.get(pattern.charAt(i)).equals(strArray[i])) {
                    return false;
                }
            }
        }

        return true;
    }
}
