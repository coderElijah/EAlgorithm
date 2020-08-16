package dynamicprogram;

import java.util.Arrays;

/**
 * Description:
 *
 * @author elijahliu
 * @Note Talk is cheap,just show me ur code.- -!
 * ProjectName:EAlgorithm
 * PackageName: dynamicprogram
 * Date: 2020/8/16 22:22
 */
public class LeetCode322 {
    public static void main(String[] args) {
        coinChange(new int[]{1, 2, 5}, 11);
    }


    //dp[i] = min{for(j:coins)}+1
    public static int coinChange(int[] coins, int amount) {
        int dp[] = new int[amount + 1];
        //一定要全部初始化一个较大的值 比如这里就初始化为amount+1 因为如果不初始化，那么在取min最小值的
//        时候 硬币的个数都是跟默认的数组值0比了，那肯定是0小
        Arrays.fill(dp, amount+1);
        dp[0] = 0;
        for (int i = 1; i <= amount; i++) {
            for (int j = 0; j < coins.length; j++) {
                if (coins[j] <= i) {
                    dp[i] = Math.min(dp[i - coins[j]] + 1, dp[i]);
                }
            }
        }
        return dp[amount] > amount ? -1 : dp[amount];
    }

}
