package leetcode.easy.page7;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Semaphore;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class PrintInOrder {
    private volatile boolean second, third;

    public PrintInOrder() {

    }

    public void first(Runnable printFirst) throws InterruptedException {
        // printFirst.run() outputs "first". Do not change or remove this line.
        printFirst.run();
        second = true;
    }

    public void second(Runnable printSecond) throws InterruptedException {
        while (second);
        // printSecond.run() outputs "second". Do not change or remove this line.
        printSecond.run();
        third = true;
    }

    public void third(Runnable printThird) throws InterruptedException {
        while (third);
        // printThird.run() outputs "third". Do not change or remove this line.
        printThird.run();
    }
}
