package AutumnRecruitLc.jianZhi;

/**
 * @author ：yuan_ge
 * @date ：Created 2021/6/26 21:42
 */


public class jz10_1 {


    public static int fib(int n) {
        if (n == 0) return 0;
        if (n == 1 || n == 2) return 1;
        int sum = 0, pre = 1, cur = 1;
        for (int i = 3; i <= n; i++) {
            sum = (pre + cur) % 1000000007;
            pre = cur;
            cur = sum;
        }
        return sum;
    }

    public static void main(String[] args) {
        int fib = fib(20);
        System.out.println(fib);
    }
}
