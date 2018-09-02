package leetcode.easy.pageone;

/**
 * @author Kyle
 * @create 2018/4/13 1:55
 */
public class CountAndSay {
    public String countAndSay(int n) {
        StringBuilder tmpStr = new StringBuilder("");

        String intStr = new String("1");
        for(int i = 1; i < n; i++) {
            tmpStr = new StringBuilder("");
            char[] charArray = intStr.toCharArray();
            char tmpChar = charArray[0];
            int count = 0;

            for(int j = 0; j < charArray.length; j++) {
                if(charArray[j] == tmpChar) {
                    count++;
                } else {
                    tmpStr.append(String.valueOf(count)).append(tmpChar);
                    tmpChar = charArray[j];
                    count = 1;
                }
            }
            tmpStr.append(String.valueOf(count)).append(tmpChar);
            intStr = new String(tmpStr.toString());
        }

        return intStr.toString();
    }
}
