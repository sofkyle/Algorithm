package leetcode.medium.page4;

import org.junit.jupiter.api.Test;

public class MediumPage4 {
    @Test
    public void testTopKFrequentElements(){
        TopKFrequentElements topKFrequentElements = new TopKFrequentElements();
        System.out.println(topKFrequentElements.topKFrequent(
                new int[]{3,2,3,1,2,4,5,5,6,7,7,8,2,3,1,1,1,10,11,5,6,2,4,7,8,5,6},
                10));
    }
}
