package leetcode.easy.page3;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class FindAllAnagramsInAString {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> result = new LinkedList<>();

        int sLen = s.length();
        int pLen = p.length();

        char[] pOrder = p.toCharArray();
        Arrays.sort(pOrder);

        for (int i = 0; i <= sLen - pLen; i++) {
            char[] sOrder = s.substring(i, i + pLen).toCharArray();
            Arrays.sort(sOrder);

            boolean isAnagram = true;
            for (int j = 0; j < pLen; j++) {
                if (sOrder[j] != pOrder[j]) {
                    isAnagram = false;
                    break;
                }
            }

            if (isAnagram) {
                result.add(i);
            }
        }

        return result;
    }
}
