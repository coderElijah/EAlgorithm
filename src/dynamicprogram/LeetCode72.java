package dynamicprogram;

/**
 * Description:
 *
 * @author elijahliu
 * @Note Talk is cheap,just show me ur code.- -!
 * ProjectName:EAlgorithm
 * PackageName: dynamicprogram
 * Date: 2020/8/18 21:12
 */
public class LeetCode72 {
    // dp[i][j] = min{dp[i-1][j],dp[i][j-1],dp[i-1][j-1]+1}
    public int minDistance(String word1, String word2) {
        int m = word1.length(), n = word2.length();
        int dp[][] = new int[m + 1][n + 1];
        for (int i = 0; i <= m; i++) {
            dp[i][0] = i;
        }
        for (int i = 0; i <= n; i++) {
            dp[0][i] = i;
        }
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                dp[i][j] = Math.min(dp[i - 1][j]+1, dp[i][j - 1]+1);
                if (word1.charAt(i-1) == word2.charAt(j-1)) {
                    dp[i][j] = Math.min(dp[i - 1][j - 1],dp[i][j]);
                }else{
                    dp[i][j] = Math.min(dp[i - 1][j - 1] + 1, dp[i][j]);
                }
            }
        }
        return dp[m][n];

    }

}
