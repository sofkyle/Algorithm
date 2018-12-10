package leetcode.easy.page1;

/**
 * @author Kyle
 * @create 2018/9/2 0:02
 */
public class RotateArray {
    // solution 1
    /*public void rotate(int[] nums, int k) {
        for(int loopTimes = 0; loopTimes < k; loopTimes++) {
            int front = nums[nums.length - 1];
            for (int i = 0; i < nums.length; i++) {
                int current = nums[i];
                nums[i] = front;

                // freshen front
                front = current;
            }
        }
    }*/

    // solution 2
    /*public void rotate(int[] nums, int k) {

        if(nums == null || nums.length < 2) {
            return;
        }

        int n = nums.length;
        k %= n;
        if(k == 0) {
            return;
        }
        int num = computeLCF(k, n);
        for(int i = 0; i < num; ++i) {

            rotateGroup(nums, i, k);
        }
    }

    // get the largest commont factor (LCF)
    private int computeLCF(int m , int n) {
        while(m != 0) {
            n %= m;
            int tmp = m;
            m = n;
            n = tmp;
        }
        return n;
    }

    private void rotateGroup(int[] nums, int start, int step) {
        int n = nums.length;
        int tmp = nums[start];
        int cur = start;
        int before;
        while((before = (cur - step + n) % n) != start) {
            nums[cur] = nums[before];
            cur = before;
        }
        nums[cur] = tmp;
    }*/

    // solution 3
    public void rotate(int[] nums, int k) {
        if (nums == null || nums.length < 2) return;

        k %= nums.length;

        reverse(nums, 0, nums.length - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, nums.length - 1);
    }

    private void reverse(int[] nums, int i, int j){
        for (int h = i, t = j; h < t; h++,t--) {
            int tmp = nums[h];
            nums[h] = nums[t];
            nums[t] = tmp;
        }
    }
}
