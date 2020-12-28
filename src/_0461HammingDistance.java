public class _0461HammingDistance {
  public int hammingDistance(int x, int y) {
    int xor = x ^ y;
    int d = 0;
    for (int i = 0; i <= 31; i++) {
      d += xor % 2;
      xor >>= 1;
    }
    return d;
  }
}
