public class _0174DungeonGame {
  public int calculateMinimumHP(int[][] dungeon) {
    int length = dungeon.length;
    int width = dungeon[0].length;
    int[][] dp = new int[length][width];
    for (int x = length - 1; x >= 0; x--) {
      for (int y = width - 1; y >= 0; y--) {
        if (x == length - 1 && y == width - 1) {
          dp[x][y] = Math.max(1, 1 - dungeon[x][y]);
        } else if (x == length - 1) {
          dp[x][y] = Math.max(1, dp[x][y + 1] - dungeon[x][y]);
        } else if (y == width - 1) {
          dp[x][y] = Math.max(1, dp[x + 1][y] - dungeon[x][y]);
        } else {
          dp[x][y] = Math.max(1, Math.min(dp[x][y + 1], dp[x + 1][y]) - dungeon[x][y]);
        }
      }
    }
    return dp[0][0];
  }
}
