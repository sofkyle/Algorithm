package leetcode.easy.page2;

/**
 * @author Kyle
 * @create 2018/10/7 10:22
 */
public class FirstBadVersion {
    public int firstBadVersion(int n) {
        int head = 1;
        int tail = n;
        while (head < tail) {
            int mid = head +(tail - head) / 2;
            if (isBadVersion(mid)) {
                tail = mid;
            } else {
                head = mid + 1;
            }
        }
        return head;
    }

    private boolean isBadVersion(int version) {
        return version >= 1702766719;
    }
}
