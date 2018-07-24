package leetcode.easy;

import java.util.Arrays;
import java.util.List;

/**
 * @author Kyle
 * @create 2018/7/24 23:12
 */
public class PascalsTriangle {
    public List<List<Integer>> generate(int numRows) {
        if(numRows == 1) {
            return Arrays.asList(Arrays.asList(1));
        }

        int [][] pascalsTriangele = new int[numRows][numRows];
        // init
        pascalsTriangele[0][0] = 1;

        for(int i = 1; i < numRows; i++) {
            for(int j = 0; j <= i; j++) {
                pascalsTriangele[i][j] = pascalsTriangele[i - 1][j] + pascalsTriangele[i - 1][i - 1];
            }
        }

        return null;
    }
}
