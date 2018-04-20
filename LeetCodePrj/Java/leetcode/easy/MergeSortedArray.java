package leetcode.easy;

/**
 * @author Kyle
 * @create 2018/4/20 16:02
 */
public class MergeSortedArray {
    public void mergeSortedArray(int[] nums1, int m, int[] nums2, int n) {
        int i = 0, j = 0;
        while(i < m + j && j < n) {
            if(nums1[i] <= nums2[j]) {
                i++;
                continue;
            } else {
                backShift(nums1, i , m + j);
                nums1[i] = nums2[j];
                i++;
                j++;
            }
        }

        if(j < n) {
            for(; j < n; i++, j++) {
                nums1[i] = nums2[j];
            }
        }
    }

    private void backShift(int[] nums, int pos, int length) {
        for(int k = length; k > pos; k--) {
            nums[k] = nums[k - 1];
        }
    }
 }
