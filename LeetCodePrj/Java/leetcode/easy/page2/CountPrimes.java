package leetcode.easy.page2;

/**
 * @author Kyle
 * @create 2018/9/6 23:27
 */
public class CountPrimes {
    public int countPrimes(int n) {
        int count = 0;
        boolean[] nonPrimes = new boolean[n];

        for (int i = 2; i < n; i++) {
            if (!nonPrimes[i]) {
                count++;
                for (int j = 2; i * j < n; j++) {
                    nonPrimes[i * j] = true;
                }
            }
        }

        return count;
    }
}
