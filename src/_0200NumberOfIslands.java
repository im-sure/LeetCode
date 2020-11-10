public class _0200NumberOfIslands {
  public int numIslands(char[][] grid) {
    int n = 1;
    int width = grid.length;
    int length = grid[0].length;
    int[][] nums = new int[width][length];
    for (int i = 0; i < width; i++) {
      for (int j = 0; j < length; j++) {
        if (grid[i][j] == '1' && nums[i][j] == 0) {
          colour(grid, nums, width, length, i, j, n++);
        }
      }
    }
    return n - 1;
  }

  private void colour(char[][] grid, int[][] nums, int width, int length, int x, int y, int n) {
    nums[x][y] = n;
    if (x - 1 >= 0 && grid[x - 1][y] == '1' && nums[x - 1][y] == 0) {
      colour(grid, nums, width, length, x - 1, y, n);
    }
    if (x + 1 < width && grid[x + 1][y] == '1' && nums[x + 1][y] == 0) {
      colour(grid, nums, width, length, x + 1, y, n);
    }
    if (y - 1 >= 0 && grid[x][y - 1] == '1' && nums[x][y - 1] == 0) {
      colour(grid, nums, width, length, x, y - 1, n);
    }
    if (y + 1 < length && grid[x][y + 1] == '1' && nums[x][y + 1] == 0) {
      colour(grid, nums, width, length, x, y + 1, n);
    }
  }
}
