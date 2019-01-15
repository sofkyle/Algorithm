package leetcode.easy.page3;

public class NumberOfSegmentsInAString {
    public int countSegments(String s) {
        int numOfSegments = 0;

        int i = 0;
        boolean startCount = true;
        while (i < s.length()) {
            if (startCount && (s.charAt(i) >= 'a' && s.charAt(i) <= 'z'
                    || s.charAt(i) >= 'A' && s.charAt(i) <= 'Z')) {
                numOfSegments++;
                startCount = false;
            }
            if (s.charAt(i) < 'a' || s.charAt(i) > 'z'
                    && s.charAt(i) < 'A' || s.charAt(i) > 'Z') {
                startCount = true;
            }
            i++;
        }

        return numOfSegments;
    }
}
