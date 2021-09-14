public class _0052NQueensII {
  private int num;

  public int totalNQueens(int n) {
    boolean[] col = new boolean[n];
    boolean[] slash = new boolean[2 * n - 1];
    boolean[] backSlask = new boolean[2 * n - 1];
    solve(n, 0, col, slash, backSlask);
    return num;

  }

  private void solve(int n, int row, boolean[] col, boolean[] slash, boolean[] backSlask) {
    for (int i = 0; i < n; i++) {
      int slashIndex = n + row - i - 1;
      int backSlashIndex = row + i;
      if (col[i] || slash[slashIndex] || backSlask[backSlashIndex]) {
        continue;
      }
      col[i] = true;
      slash[slashIndex] = true;
      backSlask[backSlashIndex] = true;
      if (row == n - 1) {
        num++;
      } else {
        solve(n, row + 1, col, slash, backSlask);
      }
      col[i] = false;
      slash[slashIndex] = false;
      backSlask[backSlashIndex] = false;
    }
  }
}
