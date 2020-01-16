package leetcode.medium.page5;

import java.util.Collections;

public class SortCharactersByFrequency {
    int[] bucket = new int[52];

    public String frequencySort(String s) {
        for (char ch : s.toCharArray()) {
            if (ch >= 'a' && ch <= 'z') {
                bucket[ch - 'a']++;
            } else if (ch >= 'A' && ch <= 'Z') {
                bucket[ch - 'A' + 26]++;
            }
        }

        Collections.so

        return null;
    }
}
