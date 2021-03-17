public class _LCP06 {
  public int minCount(int[] coins) {
    int count = 0;
    for (int coin : coins) {
      count += coin / 2 + coin % 2;
    }
    return count;
  }
}
