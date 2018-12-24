package leetcode.easy.page3;

public class AddStrings {
    public String addStrings(String num1, String num2) {
        String sum = "";

        Integer carryBit = 0;

        Integer maxLen = Math.max(num1.length(), num2.length());
        Integer minLen = Math.min(num1.length(), num2.length());

        char[] num1CharArr = num1.toCharArray();
        char[] num2CharArr = num2.toCharArray();

        for (int i = 0; i < maxLen; i++) {
            if (i < minLen || carryBit != 0) {
                sum = (Integer.valueOf(num1CharArr[i]) + Integer.valueOf(num2CharArr[i])
                        + carryBit) % 10 + sum;
                carryBit = (Integer.valueOf(num1CharArr[i]) + Integer.valueOf(num2CharArr[i])
                        + carryBit) / 10;
            } else {
                break;
            }
        }

        return sum;
    }
}
