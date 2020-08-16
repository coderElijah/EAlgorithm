package dynamicprogram;

/**
 * Description:
 *
 * @author elijahliu
 * @Note Talk is cheap,just show me ur code.- -!
 * ProjectName:EAlgorithm
 * PackageName: dynamicprogram
 * Date: 2020/8/16 19:10
 */
public class LeetCode70 {
    //dp[i] = dp[i-1]+dp[i-2]
    //
    public int climbStairs(int n) {
        if (n <= 2) {
            return n;
        }
        int dp[] = new int[n + 1];
        dp[1] = 1;
        dp[2] = 2;
        for (int i = 3; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[n];
    }
}
