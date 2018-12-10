package leetcode.easy.page2;

public class RansomNote {
    public boolean canConstruct(String ransomNote, String magazine) {
        if (ransomNote.length() > magazine.length()) return false;

        int[] charArr = new int[128];
        for (Character c : ransomNote.toCharArray()) {
            int index = magazine.indexOf(c, charArr[c.charValue()]);
            if (index < 0) {
                return false;
            }
            charArr[c.charValue()] = index + 1;
        }

        return true;
    }
}
