package leetcode.easy.page3;

import java.util.Arrays;

public class Heaters {
    public int findRadius(int[] houses, int[] heaters) {
        Arrays.sort(heaters);

        int radius = 0;

        for (int i = 0; i < houses.length; i++) {
            int dis = this.binarySearchMinDistance(heaters, 0, heaters.length - 1, houses[i]);

            radius = Math.max(radius, dis);
        }

        return radius;
    }

    /**
     * Find the min distance from the house to the heaters
     * @param heaters
     * @param l
     * @param r
     * @param housePos
     * @return
     */
    private int binarySearchMinDistance(int[] heaters, int l, int r, int housePos) {
        if (r - l <= 1) {
            return Math.min(Math.abs(housePos - heaters[l]), Math.abs(heaters[r] - housePos));
        }

        int mid = (l + r) / 2;

        if (heaters[mid] == housePos || heaters[l] == housePos || heaters[r] == housePos) return 0;

        if (housePos < heaters[mid]) {
            return binarySearchMinDistance(heaters, l, mid, housePos);
        } else {
            return binarySearchMinDistance(heaters, mid, r, housePos);
        }
    }
}
