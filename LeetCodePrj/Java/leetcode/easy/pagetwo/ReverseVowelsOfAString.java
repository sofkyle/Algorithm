package leetcode.easy.pagetwo;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

public class ReverseVowelsOfAString {
    private Set<Character> vowels = new HashSet<Character>() {{
        add('a');
        add('e');
        add('i');
        add('o');
        add('u');
        add('A');
        add('E');
        add('I');
        add('O');
        add('U');
    }};

    public String reverseVowels(String s) {
        Stack<Character> stack = new Stack<>();
        char[] ca = new char[s.length()];

        for (Character c : s.toCharArray()) {
            if (vowels.contains(c)) {
                stack.push(c);
            }
        }

        for (int i = 0; i < s.length(); i++) {
            if (vowels.contains(s.charAt(i))) {
                ca[i] = stack.pop();
            } else {
                ca[i] = s.charAt(i);
            }
        }

        return new String(ca);
    }
}
