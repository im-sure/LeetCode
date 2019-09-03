
public class _0289GameOfLife {
    public void gameOfLife(int[][] board) {
    	if (board == null || board.length == 0 || board[0].length == 0) return;
    	int m = board.length;
    	int n = board[0].length;
    	int level = 0;
    	while (level < m + 1 || level < n + 1) {
	    	if (level < n) {
	    		for (int i = 0; i <= (level < m ? level : m - 1); i++) board[i][level] = getState(board, i, level);
    		}
	    	if (level < m) {
	    		for (int j = (level - 1 < n ? level - 1 : n - 1); j >= 0 ; j--) board[level][j] = getState(board, level, j);
	    	}
	    	if (level <= n) {
	    		for (int i = 0; i <= (level - 1 < m ? level - 1 : m - 1); i++) {
	    			if (board[i][level - 1] == -1) board[i][level - 1] = 0;
	    			else if (board[i][level - 1] == 2) board[i][level - 1] = 1;
	    		}
	    	}
	    	if (level <= m) {
	    		for (int j = (level - 2 >= n - 1 ? n - 1 : level - 2); j >= 0; j--) {
	    			if (board[level - 1][j] == -1) board[level - 1][j] = 0;
	    			else if (board[level - 1][j] == 2) board[level - 1][j] = 1;
	    		}
	    	}
    		level++;
    	}
    }
    
    private int getState(int[][]board, int x, int y) {
    	int m = board.length;
    	int n = board[0].length;
    	int state = board[x][y];
    	int live = 0;
    	for (int i = (x - 1 >= 0 ? x - 1 : 0); i <= (x + 1 < m ? x + 1 : m - 1); i++) {
    		for (int j = (y - 1 >= 0 ? y - 1 : 0); j <= (y + 1 < n ? y + 1 : n - 1); j++) {
    			if ((i != x || j != y) && (board[i][j] == -1 || board[i][j] == 1)) live++;
    		}
    	}
    	if (state == 1) {
    		if (live < 2) state = -1;
    		else if (live > 3) state = -1;
    	} else if (live == 3) state = 2;
    	else state = 0;
    	return state;
    }
}
