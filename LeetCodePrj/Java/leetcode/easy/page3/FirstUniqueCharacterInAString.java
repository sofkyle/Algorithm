package leetcode.easy.page3;

import java.util.*;

public class FirstUniqueCharacterInAString {

    int[] alpha = new int[128];

    public int firstUniqChar(String s) {
        PriorityQueue<Integer> pos = new PriorityQueue<>();

        char[] chars = s.toCharArray();

        for (int i = 0; i < chars.length; i++) {
            alpha[chars[i]]++;

            if (alpha[chars[i]] == 1) {
                pos.offer(i);
            } else {
                pos.remove(i);
            }
        }

        if (pos.isEmpty()) {
            return -1;
        } else {
            return pos.poll();
        }
    }
}
