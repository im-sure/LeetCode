public class _0063UniquePathsII {
  public int uniquePathsWithObstacles(int[][] obstacleGrid) {
    if (obstacleGrid[0][0] == 1) {
      return 0;
    }
    int w = obstacleGrid.length;
    int h = obstacleGrid[0].length;
    int[][] paths = new int[w][h];
    paths[0][0] = 1;
    for (int i = 0; i < w; i++) {
      for (int j = 0; j < h; j++) {
        if (obstacleGrid[i][j] == 0) {
          if (i > 0) {
            paths[i][j] += paths[i - 1][j];
          }
          if (j > 0) {
            paths[i][j] += paths[i][j - 1];
          }
        }
      }
    }
    return paths[w - 1][h - 1];
  }
}
