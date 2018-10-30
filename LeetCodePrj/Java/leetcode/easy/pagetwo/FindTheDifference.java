package leetcode.easy.pagetwo;

public class FindTheDifference {
    public char findTheDifference(String s, String t) {
        for(Character charT : t.toCharArray()) {
            if (s.contains(charT.toString())) {
                s = s.replaceFirst(charT.toString(), "");
            } else {
                return charT;
            }
        }
        return 0;
    }
}
