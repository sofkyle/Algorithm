package leetcode.easy.page2;

import java.util.Map;
import java.util.HashMap;


/**
 * @author Kyle
 * @create 2018/9/7 23:29
 */
public class IsomorphicStrings {
    public boolean isIsomorphic(String s, String t) {
        Map<Character, Character> alphabetMap = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            if (alphabetMap.containsKey(s.charAt(i))) {
                if (!alphabetMap.get(s.charAt(i)).equals(t.charAt(i))) {
                    return false;
                }
            } else if (alphabetMap.containsValue(t.charAt(i))) {
                return false;
            } else {
                alphabetMap.put(s.charAt(i), t.charAt(i));
            }
        }

        return true;
    }
}
