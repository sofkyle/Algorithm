package leetcode.easy.page2;

import java.util.*;

public class IntersectionOfTwoArrays {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<>();
        for (Integer i : nums1) {
            set1.add(i);
        }

        Set<Integer> set2 = new HashSet<>();
        for (Integer j : nums2) {
            if (set1.contains(j)) {
                set2.add(j);
            }
        }

        int[] result = new int[set2.size()];
        int p = 0;
        for (Integer k : set2) {
            result[p++] = k;
        }
        return result;
    }
}
