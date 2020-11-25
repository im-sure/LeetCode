public class _0085MaximalRectangle {
  public int maximalRectangle(char[][] matrix) {
    if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
      return 0;
    }
    int m = matrix.length;
    int n = matrix[0].length;
    int res = 0;
    int[][] heights = new int[m][n];
    for (int i = 0; i < m; i++) {
      for (int j = 0; j < n; j++) {
        char c = matrix[i][j];
        if (c == '0') {
          continue;
        }
        if (i == 0) {
          heights[i][j] = 1;
        } else {
          heights[i][j] = heights[i - 1][j] + 1;
        }
        int minHeight = heights[i][j];
        for (int k = j; k >= 0; k--) {
          if (heights[i][k] == 0) {
            break;
          }
          minHeight = Math.min(minHeight, heights[i][k]);
          int area = minHeight * (j - k + 1);
          res = res == 0 || res < area ? area : res;
        }
      }
    }
    return res;
  }
}
