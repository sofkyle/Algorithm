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

        Vector<Bucket> buckets = new Vector<>();
        buckets.setSize(bucketNum);

        for (int num : nums) {
            int bukcetIdx = (num - mini) / bucketSize;
            Bucket bucket = buckets.get(bukcetIdx);
            if (bucket == null) bucket = new Bucket();
            bucket.minVal = Math.min(num, bucket.minVal);
            bucket.maxVal = Math.max(num, bucket.maxVal);
            buckets.set(bukcetIdx, bucket);
        }

        int prevBuceketMax = mini, maxGap = 0;
        for (Bucket bucket : buckets) {
            if (bucket == null) {
                continue;
            }

            maxGap = Math.max(maxGap, bucket.minVal - prevBuceketMax);
            prevBuceketMax = bucket.maxVal;
        }

        return maxGap;
    }

    class Bucket {
        int minVal = Integer.MAX_VALUE;
        int maxVal = Integer.MIN_VALUE;
    }
}
