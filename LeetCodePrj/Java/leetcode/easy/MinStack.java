package leetcode.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

/**
 * @author Kyle
 * @create 2018/8/23 1:32
 */
public class MinStack {
    private int maxCapacity = 256;

    private int minNumIndex;
    private int minNumStack[];

    private int index;
    private int[] stack;

    public MinStack() {
        minNumIndex = -1;
        minNumStack = new int[maxCapacity];
        index = -1;
        stack = new int[maxCapacity];
    }

    public void push(int x) {
        if(index + 1 >= maxCapacity) {
            maxCapacity *= 2;
            stack = Arrays.copyOf(stack, maxCapacity);
            minNumStack = Arrays.copyOf(minNumStack, maxCapacity);
        }
        stack[++index] = x;
        if(minNumIndex == -1 || x <= getMin()) {
            minNumStack[++minNumIndex] = x;
        }
    }

    public void pop() {
        if(stack[index--] == getMin()) {
            minNumIndex--;
        }
    }

    public int top() {
        return stack[index];
    }

    public int getMin() {
        return minNumStack[minNumIndex];
    }
}
