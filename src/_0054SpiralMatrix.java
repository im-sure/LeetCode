import java.util.ArrayList;
import java.util.List;

public class _0054SpiralMatrix {
  public List<Integer> spiralOrder(int[][] matrix) {
    int xStart = 0;
    int xEnd = matrix.length - 1;
    int yStart = 0;
    int yEnd = matrix[0].length - 1;
    List<Integer> res = new ArrayList<>();
    int direct = 0;
    while (xStart <= xEnd && yStart <= yEnd) {
      switch (direct) {
        case 0:
          for (int i = yStart; i <= yEnd; i++) {
            res.add(matrix[xStart][i]);
          }
          xStart++;
          break;
        case 1:
          for (int i = xStart; i <= xEnd; i++) {
            res.add(matrix[i][yEnd]);
          }
          yEnd--;
          break;
        case 2:
          for (int i = yEnd; i >= yStart; i--) {
            res.add(matrix[xEnd][i]);
          }
          xEnd--;
          break;
        case 3:
          for (int i = xEnd; i >= xStart; i--) {
            res.add(matrix[i][yStart]);
          }
          yStart++;
          break;
      }
      direct++;
      if (direct == 4) {
        direct = 0;
      }
    }
    return res;
  }
}
