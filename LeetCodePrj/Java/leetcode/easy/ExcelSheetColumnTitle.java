package leetcode.easy;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Kyle
 * @create 2018/8/30 1:00
 */
public class ExcelSheetColumnTitle {
    private static final Integer radius = 26;

    private final Map<Integer, Character> map;

    public ExcelSheetColumnTitle() {
        map = new HashMap<>();
        for (int i = 0; i < radius; i++) {
            map.put(i, (char)('A' + i));
        }
    }

    public String convertToTitle(int n) {
        if (n < 1) return null;

        StringBuilder columnTitle = new StringBuilder("");

        while (n != 0) {
            --n;
            columnTitle.insert(0, map.get(n % radius).charValue());
            n /= radius;
        }

        return columnTitle.toString();
    }
}
