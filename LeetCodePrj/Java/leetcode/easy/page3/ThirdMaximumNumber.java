package leetcode.easy.page3;

import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Set;

public class ThirdMaximumNumber {
    public int thirdMax(int[] nums) {
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        Set<Integer> set = new HashSet<>();

        for (int i : nums) {
            if (!set.contains(i)) {
                queue.offer(i);
                set.add(i);
                if (queue.size() > 3) {
                    set.remove(queue.poll());
                }
            }
        }
        if (queue.size() < 3) {
            while (queue.size() > 1) {
                queue.poll();
            }
        }
        return queue.peek();
    }
}
