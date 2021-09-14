import java.util.ArrayList;
import java.util.List;

public class _0051NQueens {
  private List<List<String>> res;

  public List<List<String>> solveNQueens(int n) {
    res = new ArrayList<>();
    boolean[] col = new boolean[n];
    boolean[] slash = new boolean[2 * n - 1];
    boolean[] backSlask = new boolean[2 * n - 1];
    List<String> rows = new ArrayList<>();
    solve(n, 0, col, slash, backSlask, rows);
    return res;
  }

  private void solve(int n, int row, boolean[] col, boolean[] slash, boolean[] backSlask, List<String> rows) {
    for (int i = 0; i < n; i++) {
      int slashIndex = n + row - i - 1;
      int backSlashIndex = row + i;
      if (col[i] || slash[slashIndex] || backSlask[backSlashIndex]) {
        continue;
      }
      col[i] = true;
      slash[slashIndex] = true;
      backSlask[backSlashIndex] = true;
      rows.add(generateRow(n, i));
      if (row == n - 1) {
        res.add(new ArrayList<>(rows));
      } else {
        solve(n, row + 1, col, slash, backSlask, rows);
      }
      col[i] = false;
      slash[slashIndex] = false;
      backSlask[backSlashIndex] = false;
      rows.remove(row);
    }
  }

  private String generateRow(int n, int i) {
    StringBuilder sb = new StringBuilder();
    for (int j = 0; j < n; j++) {
      if (j == i) {
        sb.append('Q');
      } else {
        sb.append('.');
      }
    }
    return sb.toString();
  }
}
