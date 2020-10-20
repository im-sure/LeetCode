public class _1016BinaryStringWithSubstringsRepresenting1ToN {
  public boolean queryString(String S, int N) {
    int exp = (int)(Math.log(N) / Math.log(2));
    if (exp > 1) {
      exp -= 1;
    }
    int startNum = 1 << exp;
    for (int i = startNum; i <= N; i++) {
      String binary = Integer.toBinaryString(i);
      if (!S.contains(binary)) {
        return false;
      }
    }
    return true;
  }
}
