package leetcode.easy.page1;

/**
 * @author Kyle
 * @create 2018/8/22 0:46
 */
public class SingleNumber {
    /*public int singleNumber(int[] nums) {
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
    }*/

    /** Set Version **/
    /*public int singleNumber(int[] nums) {
        Set set = new HashSet();
        for(int i : nums) {
            if(!set.remove(i)) {
                set.add(i);
            }
        }

        return (int) set.iterator().next();
    }*/

    /** Exclusive Or Verion **/
    public int singleNumber(int[] nums) {
        if(nums == null || nums.length == 0) return -1;

        int x = 0;
        for(int i : nums) {
            x ^= i;
        }

        return x;
    }
}
