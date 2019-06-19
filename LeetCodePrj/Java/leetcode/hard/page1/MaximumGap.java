package leetcode.hard.page1;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class MaximumGap {

    private boolean used = false;

    public int maximumGap(int[] nums) {
        if (nums.length < 2) {
            return 0;
        }

        List<Integer> numList = Arrays.stream(nums).boxed().collect(Collectors.toList());
        int mini = Collections.min(numList);
        int maxi = Collections.max(numList);

        int bucketSize = Math.max(1, (maxi - mini) / ((int) nums.length - 1));

        return 0;
    }
}
