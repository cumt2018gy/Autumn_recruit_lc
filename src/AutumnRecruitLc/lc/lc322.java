package AutumnRecruitLc.lc;

import java.util.Arrays;

/**
 * @author ：yuan_ge
 * @date ：Created 2021/6/26 21:53
 */
public class lc322 {

    public static int coinChange(int[] coins, int amount) {
        int[] dp = new int[amount + 1];
        Arrays.fill(dp, amount + 1);
        Arrays.sort(coins);
        dp[0] = 0;

        //i 代表amount目标钱数 coins 表示可供选择的硬币金额
        for (int i = 0; i < dp.length; i++) {
            for (int coin : coins) {
                if (i - coin < 0) break;
                dp[i] = Math.min(dp[i], dp[i - coin] + 1);
            }
        }
        return dp[amount] == amount + 1 ? -1 : dp[amount];
    }

    public static void main(String[] args) {
        int i = coinChange(new int[]{474, 83, 404, 3}, 264);
        System.out.println(i);
    }
}
