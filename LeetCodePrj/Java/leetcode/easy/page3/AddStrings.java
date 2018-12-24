package leetcode.easy.page3;

public class AddStrings {
    public String addStrings(String num1, String num2) {
        String sum = "";

        Integer carryBit = 0;

        String longStr = num1.length() > num2.length() ? num1 : num2;
        String shortStr = num1.length() > num2.length() ? num2 : num1;

        for (int i = 0; i < longStr.length(); i++) {
            if (i >= shortStr.length() && carryBit == 0) break;
            if (i < shortStr.length()) {
                sum = (Integer.parseInt(String.valueOf(longStr.charAt(i)))
                        + Integer.parseInt(String.valueOf(shortStr.charAt(i)))
                        + carryBit) % 10 + sum;
                carryBit = (Integer.parseInt(String.valueOf(longStr.charAt(i)))
                        + Integer.parseInt(String.valueOf(shortStr.charAt(i)))
                        + carryBit) / 10;
            }
        }

        return sum;
    }
}
