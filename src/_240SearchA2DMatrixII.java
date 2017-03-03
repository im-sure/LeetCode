
public class _240SearchA2DMatrixII {
    public boolean searchMatrix(int[][] matrix, int target) {
    	if (matrix == null || matrix.length == 0 || matrix[0].length == 0) return false;
        int x = 0;
        int y = matrix[0].length - 1;
        while (x < matrix.length && y >= 0) {
        	int n = matrix[x][y];
        	if (n == target) return true;
        	else if (n < target) x++;
        	else y--;
        }
        return false;
    }
}
