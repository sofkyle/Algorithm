package leetcode.easy;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Kyle
 * @create 2018/8/22 0:46
 */
public class SingleNumber {
    public int singleNumber(int[] nums) {
        Map<Integer, Object> map = new HashMap<>();

        for(int i : nums) {
            if(map.containsKey(i)) {
                map.put(i, 2);
            } else {
                map.put(i, 1);
            }
        }

        for(Map.Entry entry : map.entrySet()) {
            if(entry.getValue().equals(1)) {
                return Integer.valueOf(entry.getKey().toString());
            }
        }

        return 0;
    }
}
