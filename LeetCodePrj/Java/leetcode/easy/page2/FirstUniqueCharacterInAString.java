package leetcode.easy.page2;

public class FirstUniqueCharacterInAString {
    public int firstUniqChar(String s) {
        int[] countArr = new int[26];

        for (char c : s.toCharArray()) {
            countArr[c - 97]++;
        }

        for (int i = 0; i < s.length(); i++) {
            if (countArr[s.charAt(i) - 97] == 1) {
                return i;
            }
        }

        return -1;
    }
}