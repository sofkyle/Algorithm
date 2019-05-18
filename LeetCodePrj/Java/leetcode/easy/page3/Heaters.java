package leetcode.easy.page3;

public class Heaters {
    public int findRadius(int[] houses, int[] heaters) {
        int radius = 0;
        for (int i = 0; i < houses.length; i++) {
            int dis = Integer.MAX_VALUE;
            for (int j = 0; j < heaters.length; j++) {
                dis = Math.min(dis, Math.abs(houses[i] - heaters[j]));
            }
            radius = Math.max(radius, dis);
        }

        return radius;
    }
}
