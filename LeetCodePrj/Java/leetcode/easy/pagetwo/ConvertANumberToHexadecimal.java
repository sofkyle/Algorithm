package leetcode.easy.pagetwo;

public class ConvertANumberToHexadecimal {
    char[] decMapHex = {'0','1','2','3','4','5','6','7','8','9','a','b','c','d','e','f'};

    public String toHex(int num) {
        String result = "";

        do {
            result = decMapHex[num & 15] + result;
            num >>>= 4;
        } while (num != 0);

        return result;
    }
}
