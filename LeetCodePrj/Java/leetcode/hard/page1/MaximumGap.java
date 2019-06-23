package leetcode.hard.page1;

import java.util.*;
import java.util.stream.Collectors;

public class MaximumGap {

    public int maximumGap(int[] nums) {
        if (nums.length < 2) {
            return 0;
        }

        List<Integer> numList = Arrays.stream(nums).boxed().collect(Collectors.toList());
        int mini = Collections.min(numList);
        int maxi = Collections.max(numList);

        int bucketSize = Math.max(1, (maxi - mini) / ((int) nums.length - 1));
        int bucketNum = (maxi - mini) / bucketSize + 1;

        Vector<Bucket> buckets = new Vector<>(bucketSize);

        for (int num : nums) {
            int bukcetIdx = (num - mini) / bucketSize;
            Bucket bucket = new Bucket();
            bucket.used = true;
            bucket.minVal = Math.min(num, bucket.minVal);
            bucket.maxVal = Math.max(num, bucket.maxVal);
        }

        int prevBuceketMax = mini, maxGap = 0;
        for (Bucket bucket : buckets) {
            if (!bucket.used) {
                continue;
            }

            maxGap = Math.max(maxGap, bucket.minVal - prevBuceketMax);
            prevBuceketMax = bucket.maxVal;
        }

        return maxGap;
    }

    class Bucket {
        boolean used = false;
        int minVal = Integer.MAX_VALUE;
        int maxVal = Integer.MIN_VALUE;
    }
}
