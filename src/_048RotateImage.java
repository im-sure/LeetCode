
public class _048RotateImage {
    public void rotate(int[][] matrix) {
        int n = matrix.length;
        int half = (n + 1) / 2;
        for (int i = 0; i < half; i++) {
        	for (int j = i; j < (i == half ? half : n - i - 1); j++) {
        		int tmp = matrix[i][j];
        		matrix[i][j] = matrix[n - j - 1][i];
        		matrix[n - j - 1][i] = matrix[n - i - 1][n - j - 1];
        		matrix[n - i - 1][n - j - 1] = matrix[j][n - i - 1];
        		matrix[j][n - i - 1] = tmp;
        	}
        }
    }
}
