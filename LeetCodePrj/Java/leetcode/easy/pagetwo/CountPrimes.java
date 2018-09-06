package leetcode.easy.pagetwo;

import java.util.HashSet;
import java.util.Set;

/**
 * @author Kyle
 * @create 2018/9/6 23:27
 */
public class CountPrimes {
    private static Set<Integer> nonPrimesCache = new HashSet<>();

    public int countPrimes(int n) {
        int count = 0;
        for (int i = 2; i < n; i++) {
            if(isPrimes(i)) {
                count++;
            }
        }

        return count;
    }

    private boolean isPrimes(int num) {
        if (num <= 1 || nonPrimesCache.contains(num)) {
            return false;
        }

        int i = 2;
        while (i * i < num) {
            if (num % i == 0) {
                nonPrimesCache.add(num);
                return false;
            }
        }
        return true;
    }
}
