package leetcode.hard.page2;

import org.junit.jupiter.api.Test;

public class HardPage2 {
    @Test
    public void testLFUCache() {
        LFUCache lfuCache = new LFUCache(2);
        lfuCache.set(1,1);
        lfuCache.set(2,2);
        lfuCache.get(1);
        lfuCache.set(3,3);
        lfuCache.get(2);
        lfuCache.get(3);
        lfuCache.set(4,4);
        lfuCache.get(1);
        lfuCache.get(3);
        lfuCache.get(4);
    }
}
