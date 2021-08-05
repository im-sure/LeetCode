public class _0029DivideTwoIntegers {
  public int divide(int dividend, int divisor) {
    if (dividend == 0) {
      return 0;
    }
    if (divisor == 1) {
      return dividend;
    }
    if (dividend == Integer.MIN_VALUE && divisor == -1) {
      return Integer.MAX_VALUE;
    }
    boolean isNegative = (dividend > 0 && divisor < 0) || (dividend < 0 && divisor > 0);
    long n = Math.abs((long) dividend);
    long m = Math.abs((long) divisor);
    int quotient = 0;
    for (int i = 31; i >= 0; i--) {
      if (n >> i >= m) {
        quotient += 1 << i;
        n -= m << i;
      }
    }
    return isNegative ? -quotient : quotient;
  }
}
