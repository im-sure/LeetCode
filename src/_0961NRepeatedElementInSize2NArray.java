public class _0961NRepeatedElementInSize2NArray {
  public int repeatedNTimes(int[] A) {
    for (int i = 0; i < A.length; i++) {
      if (i > 0 && A[i] == A[i - 1]) {
        return A[i];
      }
      if (i < A.length - 1 && A[i] == A[i + 1]) {
        return A[i];
      }
      if (i > 0 && i < A.length - 1 && A[i - 1] == A[i + 1]) {
        return A[i - 1];
      }
    }
    return A[0];
  }
}
