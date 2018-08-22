package leetcode.easy;

/**
 * @author Kyle
 * @create 2018/8/21 23:38
 */
public class ValidPalindrome {
    public boolean isPalindrome(String s) {
        if(s.isEmpty()) {
            return true;
        }

        s = s.toLowerCase();

        int i = 0;
        int j = s.length() - 1;

        char[] chars = s.toCharArray();
        while (i < j) {
            while (i < j && !isAlphaNumeric(chars[i])) {
                i++;
            }
            while (i < j && !isAlphaNumeric(chars[j])) {
                j--;
            }
            if(i < j && chars[i++] != chars[j--]) {
                return false;
            }
        }

        return true;
    }

    private boolean isAlphaNumeric(char c) {
        return c >= 'a' && c <= 'z' || c >= '0' && c <= '9';
    }
}
