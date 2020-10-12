public class _1130MinimumCostTreeFromLeafValues {
  public int mctFromLeafValues(int[] arr) {
    int length = arr.length;
    int[][] dp = new int[length][length];
    return dpSearch(arr, dp, 0, length);
  }

  private int dpSearch(int[] arr, int[][] dp, int start, int end) {
    if (start == end - 1) {
      return 0;
    }
    if (dp[start][end - 1] != 0) {
      return dp[start][end - 1];
    }
    int min = Integer.MAX_VALUE;
    for (int i = start + 1; i < end; i++) {
      int value = dpSearch(arr, dp, start, i) + dpSearch(arr, dp, i, end) +
          findMax(arr, start, i) * findMax(arr, i, end);
      if (value < min) {
        min = value;
      }
    }
    dp[start][end - 1] = min;s
    return dp[start][end - 1];
  }

  private int findMax(int[] arr, int start, int end) {
    int max = Integer.MIN_VALUE;
    for (int i = start; i < end; i++) {
      if (arr[i] > max) {
        max = arr[i];
      }
    }
    return max;
  }
}
