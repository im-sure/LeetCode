public class _0984StringWithoutAAAOrBBB {
  public String strWithout3a3b(int a, int b) {
    StringBuilder sb = new StringBuilder();
    boolean nextA = a > b;
    while (a > 0 || b > 0) {
      if (nextA) {
        if (a - b >= 2) {
          sb.append("aa");
          a -= 2;
        } else {
          sb.append("a");
          a -= 1;
        }
      } else {
        if (b - a >= 2) {
          sb.append("bb");
          b -= 2;
        } else {
          sb.append("b");
          b -= 1;
        }
      }
      nextA = !nextA;
    }
    return sb.toString();
  }
}
