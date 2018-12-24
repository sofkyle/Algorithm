package leetcode.easy.page3;

public class AddStrings {
    public String addStrings(String num1, String num2) {
        String sum = "";

        Integer carryBit = 0;

        String longStr = num1.length() > num2.length() ? num1 : num2;
        String shortStr = num1.length() > num2.length() ? num2 : num1;

        int i = longStr.length() - 1;
        int j = shortStr.length() - 1;
        while (i >= 0 || carryBit != 0) {
            int a = i >= 0 ? Integer.parseInt(String.valueOf(longStr.charAt(i))) : 0;
            int b = j >= 0 ? Integer.parseInt(String.valueOf(shortStr.charAt(j))) : 0;
            sum = (a + b + carryBit) % 10 + sum;
            carryBit = (a + b + carryBit) / 10;

            i--;
            j--;
        }

        return sum;
    }
}
