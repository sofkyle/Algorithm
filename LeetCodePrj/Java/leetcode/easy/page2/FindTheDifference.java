package leetcode.easy.page2;

public class FindTheDifference {
    public char findTheDifference(String s, String t) {
        int sumS = 0;
        int sumT = 0;

        for (Character cs : s.toCharArray()) {
            sumS += cs;
        }
        for (Character ct : t.toCharArray()) {
            sumT += ct;
        }

        return (char)(sumT - sumS);
    }
}
