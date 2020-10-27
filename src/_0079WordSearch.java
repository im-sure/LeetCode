public class _0079WordSearch {
  public boolean exist(char[][] board, String word) {
    boolean[][] checked = new boolean[board.length][board[0].length];
    for (int x = 0; x < board.length; x++) {
      for (int y = 0; y < board[x].length; y++) {
        if (search(board, checked, word, 0, x, y)) {
          return true;
        }
      }
    }
    return false;
  }

  private boolean search(char[][] board, boolean[][] checked, String word, int index, int x, int y) {
    int width = board.length;
    int length = board[0].length;
    if (x < 0 || x >= width || y < 0 || y >= length || checked[x][y] || board[x][y] != word.charAt(index)) {
      return false;
    }
    if (index == word.length() - 1) {
      return true;
    }
    checked[x][y] = true;
    boolean exist = search(board, checked, word, index + 1, x - 1, y) ||
        search(board, checked, word, index + 1, x + 1, y) ||
        search(board, checked, word, index + 1, x, y - 1) ||
        search(board, checked, word, index + 1, x, y + 1);
    checked[x][y] = false;
    return exist;
  }
}
