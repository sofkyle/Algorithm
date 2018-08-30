package leetcode.easy;

/**
 * @author Kyle
 * @create 2018/8/31 0:54
 */
public class ExcelSheetColumnNumber {
    public int titleToNumber(String s) {
        int res = 0;
        int length = s.length();
        for(int i = 0; i < length; i++){
            char c = s.charAt(i);
            int temp= (c - 'A') + 1;
            res = res *26 +temp;
        }
        return res;
    }
}
