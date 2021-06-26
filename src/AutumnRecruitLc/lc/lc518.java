package AutumnRecruitLc.lc;

/**
 * @author ：yuan_ge
 * @date ：Created 2021/6/26 22:22
 */
public class lc518 {

    public static int change(int amount, int[] coins) {
        int[] dp = new int[amount + 1];
        dp[0] = 1;

        for (int coin : coins) {
            for (int i = coin; i <= amount; i++) {
                dp[i] += dp[i - coin];
            }
        }
        return dp[amount];
    }


    public static void main(String[] args) {
        int change = change(5, new int[]{1, 2, 5});
        System.out.println(change);
    }
}
