package leetcode.easy.pagetwo;

/**
 * @author Kyle
 * @create 2018/10/7 10:22
 */
public class FirstBadVersion {
    public int firstBadVersion(int n) {
        int head = 1;
        int tail = n;
        while (head < tail) {
            if (!isBadVersion(head) && isBadVersion(head + 1)) {
                head++;
                break;
            }
            if (isBadVersion((head + tail) / 2)) {
                tail = (head + tail) / 2;
            } else {
                head = (head + tail) / 2;
            }
        }
        return head;
    }

    private boolean isBadVersion(int version) {
        return false;
    }
}
