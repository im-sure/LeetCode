public class _0221MaximalSquare {
  public int maximalSquare(char[][] matrix) {
    if (matrix == null) {
      return 0;
    }
    int max = 0;
    int[][] dp = new int[matrix.length][matrix[0].length];
    for (int i = 0; i < matrix.length; i++) {
      for (int j = 0; j < matrix[0].length; j++) {
        dp[i][j] = matrix[i][j] == '1' ? 1 : 0;
        if (i != 0 && j != 0) {
          dp[i][j] = dp[i][j] + Math.min(dp[i - 1][j - 1], Math.min(dp[i - 1][j], dp[i][j - 1]));
        }
        max = Math.max(max, dp[i][j]);
      }
    }
    return max * max;
  }
}
