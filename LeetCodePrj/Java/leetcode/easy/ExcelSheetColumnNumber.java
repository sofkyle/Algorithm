package leetcode.easy;

/**
 * @author Kyle
 * @create 2018/8/31 0:54
 */
public class ExcelSheetColumnNumber {
    private static final int radius = 26;

    public int titleToNumber(String s) {
        char[] chars = s.toCharArray();
        int length = s.length();
        int columnNumber = 0;

        int exp = radius;
        columnNumber += chars[length - 1] - 'A' + 1;

        if(length <= 1) return columnNumber;

        for (int i = s.length() - 2; i >= 0; i--) {
            columnNumber += (chars[i] - 'A' + 1) * exp;
            exp *= radius;
        }

        return columnNumber;
    }
}
