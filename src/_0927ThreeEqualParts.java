import java.util.ArrayList;
import java.util.List;

public class _0927ThreeEqualParts {
  public int[] threeEqualParts(int[] A) {
    List<Integer> onePositions = new ArrayList<>();
    for (int i = 0; i < A.length; i++) {
      if (A[i] == 1) {
        onePositions.add(i);
      }
    }
    if (onePositions.size() == 0) {
      if (A.length < 3) {
        return new int[]{-1, -1};
      } else {
        return new int[]{A.length / 3 - 1, A.length / 3 * 2};
      }
    }
    if (onePositions.size() % 3 != 0) {
      return new int[]{-1, -1};
    }
    int firstEnd = onePositions.get(onePositions.size() / 3 - 1);
    int secondEnd = onePositions.get(onePositions.size() / 3 * 2 - 1);
    int suffixZeros = A.length - onePositions.get(onePositions.size() - 1) - 1;
    StringBuilder s1 = new StringBuilder();
    for (int i = 0; i <= firstEnd + suffixZeros; i++) {
      if (s1.length() == 0 && A[i] == 0) {
        continue;
      } else {
        s1.append(A[i]);
      }
    }
    StringBuilder s2 = new StringBuilder();
    for (int i = firstEnd + suffixZeros + 1; i <= secondEnd + suffixZeros; i++) {
      if (s2.length() == 0 && A[i] == 0) {
        continue;
      } else {
        s2.append(A[i]);
      }
    }
    StringBuilder s3 = new StringBuilder();
    for (int i = secondEnd + suffixZeros + 1; i < A.length; i++) {
      if (s3.length() == 0 && A[i] == 0) {
        continue;
      } else {
        s3.append(A[i]);
      }
    }
    if (s1.toString().equals(s2.toString()) && s1.toString().equals(s3.toString())) {
      return new int[]{firstEnd + suffixZeros, secondEnd + suffixZeros + 1};
    }
    return new int[]{-1, -1};
  }
}
