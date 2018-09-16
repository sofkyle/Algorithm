package leetcode.easy.pagetwo;

import java.util.HashSet;
import java.util.Set;

/**
 * @author Kyle
 * @create 2018/9/16 12:13
 */
public class ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> numSet = new HashSet<>();

        for (int i : nums) {
            if (!numSet.add(i)) {
                return true;
            }
        }

        return false;
    }
}
