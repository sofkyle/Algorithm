package leetcode.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/**
 * @author Kyle
 * @create 2018/7/24 23:12
 */
// uploading: LeetCode can't log in
public class PascalsTriangle {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> pascalsTriangele = new ArrayList<>();

        if(numRows == 1) {
            return Arrays.asList(Arrays.asList(1));
        }

        int [][] pascalsTriangeleArray = new int[numRows][numRows];
        // init
        pascalsTriangeleArray[0][0] = 1;

        for(int i = 1; i < numRows; i++) {
            for(int j = 0; j <= i; j++) {
                pascalsTriangeleArray[i][j] = pascalsTriangeleArray[i - 1][j] + (j > 0 ? pascalsTriangeleArray[i - 1][i - 1] : 0);
            }
        }

        for(int i = 0; i < numRows; i++) {
            List<Integer> row = new ArrayList<>();
            for(int j = 0; j <= i; j++) {
                row.add(pascalsTriangeleArray[i][j]);
            }
            pascalsTriangele.add(row);
        }

        return pascalsTriangele;
    }
}
