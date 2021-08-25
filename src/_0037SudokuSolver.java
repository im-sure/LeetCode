public class _0037SudokuSolver {
  public void solveSudoku(char[][] board) {
    boolean[][] rows = new boolean[9][9];
    boolean[][] cols = new boolean[9][9];
    boolean[][] boards = new boolean[9][9];
    for (int i = 0; i < 9; i++) {
      for (int j = 0; j < 9; j++) {
        if (board[i][j] == '.') {
          continue;
        }
        int n = board[i][j] - '1';
        rows[i][n] = true;
        cols[j][n] = true;
        boards[i / 3 * 3 + j / 3][n] = true;
      }
    }
    solve(board, rows, cols, boards, 0, 0);
  }

  private boolean solve(char[][] board, boolean[][] rows, boolean[][] cols, boolean[][] boards, int i, int j) {
    while (i < 9 && j < 9) {
      if (board[i][j] == '.') {
        break;
      }
      j++;
      if (j == 9) {
        i++;
        j = 0;
        if (i == 9) {
          return true;
        }
      }
    }
    for (int n = 0; n < 9; n++) {
      if (!rows[i][n] && !cols[j][n] && !boards[i / 3 * 3 + j / 3][n]) {
        rows[i][n] = true;
        cols[j][n] = true;
        boards[i / 3 * 3 + j / 3][n] = true;
        board[i][j] = (char) ('1' + n);

        int newI = i;
        int newJ = j + 1;
        if (newJ == 9) {
          newI++;
          newJ = 0;
          if (newI == 9) {
            return true;
          }
        }
        if (solve(board, rows, cols, boards, newI, newJ)) {
          return true;
        }

        rows[i][n] = false;
        cols[j][n] = false;
        boards[i / 3 * 3 + j / 3][n] = false;
        board[i][j] = '.';
      }
    }
    return false;
  }
}
