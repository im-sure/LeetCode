
public class _0036ValidSudoku {
    public boolean isValidSudoku(char[][] board) {
        for (int i = 0; i < 9; i++) {
        	int[] row = new int[9];
        	int[] col = new int[9];
        	int[] box = new int[9];
        	for (int j = 0; j < 9; j++) {
        		if (board[i][j] != '.' && ++row[board[i][j] - '1'] == 2) return false;
        		else if (board[j][i] != '.' && ++col[board[j][i] - '1'] == 2) return false;
        		else if (board[i / 3 * 3 + j / 3][i % 3 * 3 + j % 3] != '.' &&
        				++box[board[i / 3 * 3 + j / 3][i % 3 * 3 + j % 3] - '1'] == 2) return false;
        	}
        }
        return true;
    }
}
