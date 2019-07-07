package leetcode.medium.page10;

public class SortAnArray {
    public int[] sortArray(int[] nums) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int num : nums) {
            if (num < min) {
                min = num;
            }
            if (num > max) {
                max = num;
            }
        }

        int length = nums.length;
        int bucketSize = Math.max(1, (max - min) / length);
        int bucketNum = (max - min) / bucketSize + 1;
        int[][] bucket = new int[bucketNum][bucketSize];
        int[][] storeCount = new int[bucketNum][bucketSize];

        for (int num : nums) {
            int i = (num - min) / bucketSize;
            int j = (num - min) % bucketSize;
            bucket[i][j] = num;
            storeCount[i][j]++;
        }

        int[] sortedArray = new int[length];
        int k = 0;
        for (int i = 0; i < bucketNum; i++) {
            for (int j = 0; j < bucketSize; j++) {
                for (int count = 0; count < storeCount[i][j]; count++) {
                    sortedArray[k++] = bucket[i][j];
                }
            }
        }

        return sortedArray;
    }
}
