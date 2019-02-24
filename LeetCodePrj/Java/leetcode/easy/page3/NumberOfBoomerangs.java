package leetcode.easy.page3;

import java.util.HashMap;

public class NumberOfBoomerangs {
    public int numberOfBoomerangs(int[][] points) {
        int count = 0;
        for(int[] p : points){
            HashMap<Integer, Integer> maps = new HashMap<>();
            for(int[] pair : points){
                int dist = getDistance(p, pair);
                int t = maps.getOrDefault(dist, 0);
                if(maps.containsKey(dist)){
                    count = count + 2 * t;
                }
                maps.put(dist, t + 1);
            }
        }
        return count;
    }

    private int getDistance(int[] a, int[] b) {
        int dx = a[0] - b[0];
        int dy = a[1] - b[1];

        return dx * dx + dy * dy;
    }
}
