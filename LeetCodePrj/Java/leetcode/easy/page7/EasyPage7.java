package leetcode.easy.page7;

import org.junit.jupiter.api.Test;

public class EasyPage7 {
    @Test
    public void testPrintInOrder() throws Exception {
        Runnable first = new Runnable() {
            @Override
            public void run() {
                System.out.println("first");
            }
        };
        Runnable second = new Runnable() {
            @Override
            public void run() {
                System.out.println("second");
            }
        };
        Runnable third = new Runnable() {
            @Override
            public void run() {
                System.out.println("third");
            }
        };

        PrintInOrder printInOrder = new PrintInOrder();
        printInOrder.first(first);
        printInOrder.second(second);
        printInOrder.third(third);

        System.in.read();
    }
}
