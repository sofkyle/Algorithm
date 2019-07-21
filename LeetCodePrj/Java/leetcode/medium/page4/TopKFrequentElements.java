package leetcode.medium.page4;

import java.util.*;

public class TopKFrequentElements {
    public List<Integer> topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> frequency = new HashMap<>();
        // count frequency
        for (Integer i : nums) {
            if (!frequency.containsKey(i)) {
                frequency.put(i, 1);
            } else {
                frequency.put(i, frequency.get(i) + 1);
            }
        }

        List<Integer> sortedFrequency = bucketSort(frequency);

        List<Integer> result = new Vector<>(1);
        for (int i = 0; i < k; i++) {
            result.add(sortedFrequency.get(i));
        }

        return result;
    }

    private List<Integer> bucketSort(Map<Integer, Integer> frequency) {
        //  get max num
        int maxNum = 0;
        for (HashMap.Entry<Integer, Integer> entry : frequency.entrySet()) {
            if (entry.getValue() > maxNum) {
                maxNum = entry.getValue();
            }
        }

        // construct bucket
        ArrayList<Integer>[] bucket = new ArrayList[maxNum + 1];
        for (HashMap.Entry<Integer, Integer> entry : frequency.entrySet()) {
            ArrayList<Integer> temp = bucket[entry.getValue()];
            if (temp == null) {
                temp = new ArrayList<Integer>();
            }
            temp.add(entry.getKey());
            bucket[entry.getValue()] = temp;
        }

        // sort
        List<Integer> sortedFrequency = new ArrayList<>(maxNum + 1);
        for (int i = maxNum; i > 0; i--) {
            sortedFrequency.addAll(bucket[i]);
        }

        return sortedFrequency;
    }

    private List<Integer> treeMapSort(Map<Integer, Integer> frequency) {
        TreeMap<Integer, Integer> treeMap = new TreeMap<>();
        for (HashMap.Entry<Integer, Integer> entry : frequency.entrySet()) {
            treeMap.put(entry.getValue(), entry.getKey());
        }

        // sort
        List<Integer> sortedFrequency = new ArrayList<>();
        for (int i = 0; i < treeMap.size(); i++) {
            sortedFrequency.add(treeMap.firstKey());
        }

        return sortedFrequency;
    }
}
