public class _0091DecodeWays {
  public int numDecodings(String s) {
    int[] count = new int[s.length()];
    for (int i = 0; i < s.length(); i++) {
      int preN = i == 0 ? 0 : s.charAt(i - 1) - 48;
      int n = s.charAt(i) - 48;
      if (n == 0) {
        if (i == 0 || preN == 0 || preN > 2) {
          return 0;
        }
        count[i] = i == 1 ? 1 : count[i - 2];
      } else {
        count[i] = i == 0 ? 1 : count[i - 1];
        if (i > 0 && preN > 0 && (preN * 10 + n) <= 26) {
          count[i] += i == 1 ? 1 : count[i - 2];
        }
      }
    }
    return count[s.length() - 1];
  }
}
