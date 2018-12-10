package leetcode.easy.page1;

/**
 * @author Kyle
 * @create 2018/4/17 19:32
 */
public class ClimbStairs {
    private int wayOfClimb = 0;

    /* Recursive timeout
    public int climbStairs(int n) {
        if(n < 0) return 0;
        if(n - 1 == 0) return 1;
        if(n - 2 == 0) return 2;
        return climbStairs(n - 1) + climbStairs(n - 2);
    }*/

    public int climbStairs(int n) {
        if(n <= 0) return 0;
        if(n - 1 == 0) return 1;
        if(n - 2 == 0) return 2;

        int oneStepBefore = 2;
        int twoStepBefore = 1;
        int allWays = 0;

        for(int i = 2; i < n; i++) {
            allWays = oneStepBefore + twoStepBefore;
            twoStepBefore = oneStepBefore;
            oneStepBefore = allWays;
        }
        return allWays;
    }
}
