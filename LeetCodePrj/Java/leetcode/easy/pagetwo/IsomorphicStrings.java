package leetcode.easy.pagetwo;

import java.util.HashSet;
import java.util.Map;
import java.util.HashMap;
import java.util.Set;


/**
 * @author Kyle
 * @create 2018/9/7 23:29
 */
public class IsomorphicStrings {
    public boolean isIsomorphic(String s, String t) {
        Map<Character, Character> alphabetMap = new HashMap<>();
        Set<Character> check = new HashSet<>();

        char[] c1 = s.toCharArray();
        char[] c2 = t.toCharArray();

        for (int i = 0; i < s.length(); i++) {
            if (alphabetMap.get(c1[i]) != null) {
                if (alphabetMap.get(c1[i]) != c2[i]) {
                    return false;
                }
            } else {
                if (check.contains(c2[i])) {
                    return false;
                }
                alphabetMap.put(c1[i], c2[i]);
                check.add(c2[i]);
            }
        }

        return true;
    }
}
