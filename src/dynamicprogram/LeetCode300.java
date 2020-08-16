package dynamicprogram;

/**
 * Description:
 *
 * @author elijahliu
 * @Note Talk is cheap,just show me ur code.- -!
 * ProjectName:EAlgorithm
 * PackageName: dynamicprogram
 * Date: 2020/8/16 21:50
 */
public class LeetCode300 {
    //        dp[i] = if nums[i]>nums[j] : max{dp[j]}+1 0<j<i
    public int lengthOfLIS(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int dp[] = new int[nums.length + 1];
        dp[0] = 1;
        int max = 1;
        for (int i = 1; i < nums.length; i++) {
            for (int j = 0; j < i; j++) {
                if (nums[i] > nums[j]) {
                    dp[i] = Math.max(dp[j], dp[i]);
                }
            }
            dp[i] += 1;
            max = Math.max(max,dp[i]);
        }
        return max;
    }

}
