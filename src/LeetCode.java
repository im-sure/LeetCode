import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class LeetCode {
	public static void main(String[] args) {
    _0130SurroundedRegions test = new _0130SurroundedRegions();
    char[][] board = new char[][]{{'X','X','X','X'},{'X','O','O','X'},{'X','X','O','X'},{'X','O','X','X'}};
    test.solve(board);
    for (int x = 0; x < board.length; x++) {
      for (int y = 0; y < board[0].length; y++) {
        System.out.print(board[x][y]);
      }
      System.out.println();
    }
  }
}