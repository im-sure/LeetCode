public class _0312BurstBalloons {
  public int maxCoins(int[] nums) {
    int length = nums.length;
    int[] newNums = new int[length + 2];
    for (int i = 0; i < length + 2; i++) {
      if (i == 0 || i == length + 1) {
        newNums[i] = 1;
      } else {
        newNums[i] = nums[i - 1];
      }
    }
    int dp[][] = new int[length + 1][length + 1];
    return dp(newNums, dp, 1, length);
  }

  private int dp(int[] nums, int[][] dp, int start, int end) {
    if (end < start) {
      return 0;
    }
    if (dp[start][end] == 0) {
      if (start == end) {
        dp[start][end] = nums[start - 1] * nums[start] * nums[start + 1];
      } else {
        for (int i = start; i <= end; i++) {
          dp[start][end] = Math.max(dp[start][end], dp(nums, dp, start, i - 1) + nums[start - 1] * nums[i] * nums[end + 1] + dp(nums, dp, i + 1, end));
        }
      }
    }
    return dp[start][end];
  }
}
