package leetcode.easy.page2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IntersectionOfTwoArraysII {
    public int[] intersect(int[] nums1, int[] nums2) {
        if (nums1.length == 0 || nums2.length == 0) return new int[0];

        List<Integer> list1 = new ArrayList<>();
        for (int i : nums1) {
            list1.add(i);
        }

        int last = 0;
        for (int j : nums2) {
            if (list1.contains(j)) {
                nums1[last++] = j;
                list1.remove(list1.indexOf(j));
            }
        }

        return Arrays.copyOf(nums1, last);
    }
}
