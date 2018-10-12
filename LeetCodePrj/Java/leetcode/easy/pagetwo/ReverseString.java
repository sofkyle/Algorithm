package leetcode.easy.pagetwo;

import java.util.Arrays;

public class ReverseString {
    public String reverseString(String s) {
        int len = s.length();
        StringBuilder sb = new StringBuilder();

        for (int i = len - 1; i >= 0; i--) {
            sb.append(s.charAt(i));
        }

        return sb.toString();
    }
}
