public class _0074SearchA2DMatrix {
  public boolean searchMatrix(int[][] matrix, int target) {
    int i = 0;
    for (; i < matrix.length; i++) {
      if (matrix[i][0] == target) {
        return true;
      } else if (matrix[i][0] > target) {
        break;
      }
    }
    if (i == 0) {
      return false;
    } else {
      i--;
    }
    int start = 0;
    int end = matrix[0].length;
    while (start < end - 1) {
      int mid = (start + end) / 2;
      if (matrix[i][mid] == target) {
        return true;
      } else if (matrix[i][mid] > target) {
        end = mid;
      } else {
        start = mid;
      }
    }
    return matrix[i][start] == target;
  }
}
