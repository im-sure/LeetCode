public class _0130SurroundedRegions {
  public void solve(char[][] board) {
    int length = board.length;
    int width = board[0].length;
    int[][] tags = new int[length][width];
    for (int x = 0; x < length; x++) {
      for (int y = 0; y < width; y++) {
        if (board[x][y] == 'O') {
          int tag = x == 0 || x == length - 1 || y == 0 || y == width - 1 ? 2 : 1;
          tag(board, length, width, tags, tag, x, y);
        }
      }
    }
    for (int x = 0; x < length; x++) {
      for (int y = 0; y < width; y++) {
        if (tags[x][y] == 1) {
          board[x][y] = 'X';
        }
      }
    }
  }

  private void tag(char[][] board, int length, int width, int[][] tags, int tag, int x, int y) {
    if (tags[x][y] == tag) {
      return;
    }
    tags[x][y] = tags[x][y] < tag ? tag : tags[x][y];
    if (tag == 2) {
      if (x - 1 > 0 && board[x - 1][y] == 'O') {
        tag(board, length, width, tags, tag, x - 1, y);
      }
      if (x + 1 < length && board[x + 1][y] == 'O') {
        tag(board, length, width, tags, tag, x + 1, y);
      }
      if (y - 1 > 0 && board[x][y - 1] == 'O') {
        tag(board, length, width, tags, tag, x, y - 1);
      }
      if (y + 1 < width && board[x][y + 1] == 'O') {
        tag(board, length, width, tags, tag, x, y + 1);
      }
    }
  }
}
