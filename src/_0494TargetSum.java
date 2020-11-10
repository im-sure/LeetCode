public class _0494TargetSum {
  public int findTargetSumWays(int[] nums, int S) {
    int sum = 0;
    for (int n : nums) {
      sum += n;
    }
    if (sum < S || (sum + S) % 2 == 1) {
      return 0;
    }
    int target = (sum + S) / 2;
    int[] dp = new int[target + 1];
    dp[0] = 1;
    for (int n : nums) {
      for (int i = target; i >= n; i--) {
        dp[i] += dp[i - n];
      }
    }
    return dp[target];
  }
}
