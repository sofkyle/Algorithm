package leetcode.easy.pagetwo;

import leetcode.easy.pageone.MaximumDepthOfBinaryTree;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Kyle
 * @create 2018/9/16 15:40
 */
public class ContainsDuplicateII {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer, Integer> numsMap = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (numsMap.containsKey(nums[i])) {
                if (i - numsMap.get(nums[i]) <= k) {
                    return true;
                }
                numsMap.put(nums[i], i);
            } else {
                numsMap.put(nums[i], i);
            }
        }

        return false;
    }
}
