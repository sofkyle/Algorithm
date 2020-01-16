package leetcode.medium.page5;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class SortCharactersByFrequency {
    Map<Character,Bucket> buckets = new HashMap();

    public String frequencySort(String s) {
        for (char ch : s.toCharArray()) {
            Bucket bucket;
            if (!buckets.containsKey(ch)) {
                bucket = new Bucket(ch);
             } else {
                bucket = buckets.get(ch);
            }

            bucket.increment();
            buckets.put(ch, bucket);
        }

        Bucket[] sortedBucketArr = new Bucket[buckets.size()];
        sortedBucketArr = buckets.values().toArray(sortedBucketArr);
        Arrays.sort(sortedBucketArr);

        StringBuilder sb  =  new StringBuilder();
        for (Bucket bucket : sortedBucketArr) {
            for (int i = 0; i < bucket.count; i++) {
                sb.append(bucket.alpha);
            }
        }

        return sb.toString();
    }

    class Bucket implements Comparable<Bucket> {
        char alpha;
        Integer count = 0;

        public Bucket(char alpha) {
            this.alpha = alpha;
        }

        public void increment() {
            count++;
        }

        @Override
        public int compareTo(Bucket o) {
            return o.count - count;
        }
    }
}
