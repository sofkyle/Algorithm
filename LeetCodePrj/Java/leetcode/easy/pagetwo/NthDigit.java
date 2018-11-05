package leetcode.easy.pagetwo;

public class NthDigit {
    public int findNthDigit(int n) {
        long[] s = {1, 10, 190, 2890, 38890, 488890, 5888890, 68888890, 788888890, 8888888890L};
        int b = (int) Math.log10(n);
        int i = n >= s[b] ? b : b - 1;
        long r = (n - s[i]) % (i + 1);
        return (int) ((r == 0 ? 1 : 0) + (n - s[i]) / (i + 1) / Math.pow(10, i - r)) % 10;
    }
}