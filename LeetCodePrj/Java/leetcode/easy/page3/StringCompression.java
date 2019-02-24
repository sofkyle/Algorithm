package leetcode.easy.page3;

public class StringCompression {
    public int compress(char[] chars) {
        int i = 0, j = 0;
        int pos = i;

        while (j < chars.length) {
            if (j + 1 == chars.length || chars[j] != chars[j + 1]) {
                chars[i++] = chars[j];
                if (j > pos) {
                    for (char c : String.valueOf(j - pos + 1).toCharArray()) {
                        chars[i++] = c;
                    }
                }
                pos = j + 1;
            }
            j++;
        }

        return i;
    }
}
