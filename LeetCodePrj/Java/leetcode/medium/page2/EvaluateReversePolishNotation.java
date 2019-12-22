package leetcode.medium.page2;

public class EvaluateReversePolishNotation {
    int index;

    public int evalRPN(String[] tokens) {
        index = tokens.length - 1;
        return recurse(tokens);
    }

    private int recurse(String[] tokens) {
        if (index < 0) {
            return 0;
        }

        String token = tokens[index];
        index--;

        if (token.equals("+")) {
            return recurse(tokens) + recurse(tokens);
        } else if (token.equals("-")) {
            return  - recurse(tokens) + recurse(tokens);
        } else if (token.equals("*")) {
            return recurse(tokens) * recurse(tokens);
        } else if (token.equals("/")) {
            int deno = recurse(tokens);
            return recurse(tokens)/deno;
        } else {
            return Integer.parseInt(token);
        }
    }
}
