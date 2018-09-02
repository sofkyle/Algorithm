package leetcode.easy.pageone;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Kyle
 * @create 2018/7/26 23:19
 */
public class PascalsTriangleII {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> preList = Arrays.asList(1);

        for(int i = 0; i < rowIndex; i++) {
            List<Integer> curList = new ArrayList<>();
            for(int j = 0; j <= i + 1; j++) {
                curList.add((j == 0 ? 0 : preList.get(j - 1).intValue()) + (j == i + 1 ? 0 : preList.get(j).intValue()));
            }
            preList = curList;
        }
        return preList;
    }
}
