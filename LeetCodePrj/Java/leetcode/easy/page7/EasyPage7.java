package leetcode.easy.page7;

import org.junit.jupiter.api.Test;

public class EasyPage7 {
    @Test
    public void testPrintInOrder() throws Exception {
        Thread first = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("first");
            }
        });
        Thread second = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("second");
            }
        });
        Thread third = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("third");
            }
        });

        PrintInOrder printInOrder = new PrintInOrder();
        new Thread(() -> {
            try {
                printInOrder.first(first);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();
        new Thread(() -> {
            try {
                printInOrder.second(second);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();
        new Thread(() -> {
            try {
                printInOrder.third(third);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();

        System.in.read();
    }
}
