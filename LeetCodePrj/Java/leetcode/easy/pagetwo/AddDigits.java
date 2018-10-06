package leetcode.easy.pagetwo;

/**
 * @author Kyle
 * @create 2018/10/5 16:08
 */
public class AddDigits {
    public int addDigits(int num) {
        return (num - 1) % 9 + 1;
    }
}
