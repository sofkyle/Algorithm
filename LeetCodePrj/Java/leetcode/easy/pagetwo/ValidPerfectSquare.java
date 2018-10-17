package leetcode.easy.pagetwo;

public class ValidPerfectSquare {
    public boolean isPerfectSquare(int num) {
        if (num == 0 || num == 1) return true;

        int left = 1;
        int right = num;
        while (left <= right - 1) {
            int mid = left + (right - left) / 2;
            if (num / mid == mid && num % mid == 0) {
                return true;
            }
            if (num / mid < mid) {
                right = mid;
            }
            if (num / mid > mid){
                left = mid;
            }
        }

        return false;
    }
}
