public class _0069Sqrtx {
  public int mySqrt(int x) {
    if (x <= 1) {
      return x;
    }
    int up = x;
    int down = 0;
    while (down < up - 1) {
      int mid = (up + down) / 2;
      if ((long) mid * mid > x) {
        up = mid;
      } else {
        down = mid;
      }
    }
    return down;
  }
}
