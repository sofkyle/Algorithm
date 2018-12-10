package leetcode.easy.page2;

import java.util.Stack;

/**
 * @author Kyle
 * @create 2018/9/24 10:01
 */
public class MyQueue {

    private Stack<Integer> a, b;

    /** Initialize your data structure here. */
    public MyQueue() {
        a = new Stack<>();
    }

    /** Push element x to the back of queue. */
    public void push(int x) {
        a.push(x);
    }

    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
        move();
        int res = a.pop();
        recover();
        return res;
    }

    /** Get the front element. */
    public int peek() {
        move();
        int res = a.peek();
        recover();
        return res;
    }

    /** Returns whether the queue is empty. */
    public boolean empty() {
        return a.isEmpty();
    }

    private void move() {
        b = new Stack<>();
        while (a.size() > 1) {
            b.push(a.pop());
        }
    }

    private void recover() {
        while (b.size() > 0) {
            a.push(b.pop());
        }
    }
}
