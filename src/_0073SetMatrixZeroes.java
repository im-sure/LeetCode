public class _0073SetMatrixZeroes {
  public void setZeroes(int[][] matrix) {
    boolean isFirstRowZero = false;
    for (int i = 0; i < matrix.length; i++) {
      for (int j = 0; j < matrix[i].length; j++) {
        if (matrix[i][j] == 0) {
          if (i == 0) {
            isFirstRowZero = true;
          } else {
            matrix[i][0] = 0;
          }
          matrix[0][j] = 0;
        }
      }
    }
    for (int i = 1; i < matrix.length; i++) {
      if (matrix[i][0] == 0) {
        for (int j = 0; j < matrix[i].length; j++) {
          matrix[i][j] = 0;
        }
      }
    }
    for (int j = 0; j < matrix[0].length; j++) {
      if (matrix[0][j] == 0) {
        for (int i = 0; i < matrix.length; i++) {
          matrix[i][j] = 0;
        }
      }
    }
    if (isFirstRowZero) {
      for (int j = 0; j < matrix[0].length; j++) {
        matrix[0][j] = 0;
      }
    }
  }
}
