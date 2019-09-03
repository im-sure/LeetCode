
public class _0378KthSmallestElementInASortedMatrix {
    public int kthSmallest(int[][] matrix, int k) {
        int n = matrix.length;
        int low = matrix[0][0];
        int high = matrix[n - 1][n - 1];
        while (low <= high) {
        	int mid = low + (high - low) / 2;
        	int count = 0;
        	int i = n - 1;
        	int j = 0;
        	while (i >= 0 && j < n) {
        		if (matrix[i][j] > mid) i--;
        		else {
        			count += i + 1;
        			j++;
        		}
        	}
        	if (count < k) low = mid + 1;
        	else high = mid - 1;
        }
        return low;
    }
}
