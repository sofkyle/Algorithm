package leetcode.easy.pagetwo;

public class RansomNote {
    public boolean canConstruct(String ransomNote, String magazine) {
        if (ransomNote.length() > magazine.length()) return false;

        StringBuilder sb = new StringBuilder(magazine);
        for (Character c : ransomNote.toCharArray()) {
            int index = sb.indexOf(c.toString());
            if (index >= 0) {
                sb.deleteCharAt(index);
            } else {
                return false;
            }
        }

        return true;
    }
}
