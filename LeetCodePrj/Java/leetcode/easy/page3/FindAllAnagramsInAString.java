package leetcode.easy.page3;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class FindAllAnagramsInAString {
    public List<Integer> findAnagrams(String s, String p) {
        final char[] ss = s.toCharArray();
        final char[] pp = p.toCharArray();

        int[] target = new int[128];
        for (char c : pp) target[c]++;

        List<Integer> ans = new LinkedList<>();
        int l = 0; int r =0 ;
        int[] cnt = new int[128];
        int total = 0;
        while (r < ss.length) {
            cnt[ss[r]]++;
            total++;

            while (cnt[ss[r]] > target[ss[r]]) {
                cnt[ss[l++]]--;
                total--;
            }

            if (total == pp.length) ans.add(l);

            r++;
        }

        return ans;
    }

}
