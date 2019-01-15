package leetcode.easy.page3;

public class NumberOfSegmentsInAString {
    public int countSegments(String s) {
        int numOfSegments = 0;

        int i = 0;
        boolean startCount = true;
        while (i < s.length()) {
            if (startCount && (s.charAt(i) != ' ')) {
                numOfSegments++;
                startCount = false;
            }
            if (s.charAt(i) == ' ') {
                startCount = true;
            }
            i++;
        }

        return numOfSegments;
    }
}
