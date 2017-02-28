
public class _059SpiralMatrixII {
    public int[][] generateMatrix(int n) {
        int[][] nums = new int[n][n];
        boolean horizontal = true;
        boolean left = true;
        boolean top = true;
        int x = 0;
        int y = 0;
        for (int i = 0; i < n * n; i++) {
			nums[x][y] = i + 1;
        	if (horizontal) {
        		if (left) {
        			y++;
        			if (y >= n || nums[x][y] != 0) {
        				y--;
        				x++;
        				horizontal = false;
        				left = false;
        			}
        		} else {
        			y--;
        			if (y < 0 || nums[x][y] != 0) {
        				y++;
        				x--;
        				horizontal = false;
        				left = true;
        			}
        		}
        	} else {
        		if (top) {
        			x++;
        			if (x >= n || nums[x][y] != 0) {
        				x--;
        				y--;
        				horizontal = true;
        				top = false;
        			}
        		} else {
        			x--;
        			if (x < 0 || nums[x][y] != 0) {
        				x++;
        				y++;
        				horizontal = true;
        				top = true;
        			}
        		}
        	}
        }
        return nums;
    }
}
