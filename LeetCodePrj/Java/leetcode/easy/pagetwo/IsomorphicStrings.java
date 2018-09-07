package leetcode.easy.pagetwo;

import java.util.HashSet;
import java.util.Set;

/**
 * @author Kyle
 * @create 2018/9/7 23:29
 */
public class IsomorphicStrings {
    public boolean isIsomorphic(String s, String t) {
        Set<Character> s1 = new HashSet<>();
        Set<Character> s2 = new HashSet<>();

        char[] c1 = s.toCharArray();
        char[] c2 = t.toCharArray();

        for (int i = 0; i < s.length(); i++) {
            if (s1.contains(c1[i])) {
                if (!s2.contains(c2[i])) return false;
            } else {
                if (s2.contains(c2[i])) return false;
                s1.add(c1[i]);
                s2.add(c2[i]);
            }
        }

        return true;
    }
}
