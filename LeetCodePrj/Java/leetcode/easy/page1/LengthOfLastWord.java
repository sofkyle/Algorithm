package leetcode.easy.page1;

/**
 * @author Kyle
 * @create 2018/4/14 1:02
 */
public class LengthOfLastWord {
    public int lengthOfLastWord(String s) {
        String[] strArr = s.split(" ");
        return strArr.length == 0 ? 0 : strArr[strArr.length - 1].length();
    }
}
