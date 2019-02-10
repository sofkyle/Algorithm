package leetcode.easy.page3;

import java.util.LinkedList;
import java.util.List;

public class FindAllAnagramsInAString {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> result = new LinkedList<>();

        int sLen = s.length();
        int pLen = p.length();

        for (int i = 0; i < sLen - pLen; i++) {
            int xorRes = 0;
            for (int j = 0; j < pLen; j++) {
                xorRes ^= s.charAt(i + j) ^ p.charAt(j);
            }

            if (xorRes == 0) result.add(i);
        }

        return result;
    }
}
