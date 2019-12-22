package leetcode.medium.page2;

import java.util.Stack;

public class EvaluateReversePolishNotation {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();

        for (String c : tokens) {
            if (c.equals("+") || c.equals("-") || c.equals("*") || c.equals("/")) {
                int result = 0;
                Integer a = stack.pop();
                Integer b = stack.pop();
                result += calculate(b, a, c);
                stack.push(result);
            } else {
                stack.push(Integer.valueOf(c));
            }
        }
        return stack.pop();
    }

    private int calculate(int a, int b, String operator) {
        switch (operator) {
            case "+": return a + b;
            case "-": return a - b;
            case "*": return a * b;
            case "/": return a / b;
            default: return 0;
        }
    }
}
