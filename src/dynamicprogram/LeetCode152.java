package dynamicprogram;

/**
 * Description:
 *
 * @author elijahliu
 * @Note Talk is cheap,just show me ur code.- -!
 * ProjectName:EAlgorithm
 * PackageName: dynamicprogram
 * Date: 2020/8/16 19:56
 */
public class LeetCode152 {
    public int maxProduct(int[] nums) {
        int[][] dp = new int[nums.length + 1][2];
        //dp[i][0] = max{dp[i-1][0]*nums[i],dp[i-1][1]*nums[i],nums[i]}
        dp[0][0] = nums[0];
        dp[0][1] = nums[0];
        int max = nums[0];
        for (int i = 1; i < nums.length; i++) {
            dp[i][0] = Math.max(Math.max(dp[i - 1][0] * nums[i], dp[i - 1][1] * nums[i]), nums[i]);
            dp[i][1] = Math.min(Math.min(dp[i - 1][0] * nums[i], dp[i - 1][1] * nums[i]), nums[i]);
            max = Math.max(dp[i][0], max);
        }
        return max;
    }
}
