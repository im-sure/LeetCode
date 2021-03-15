public class _0041FirstMissingPositive {
  public int firstMissingPositive(int[] nums) {
    boolean[] has = new boolean[301];
    for (int num : nums) {
      if (num > 0 && num <= 300) {
        has[num] = true;
      }
    }
    for (int i = 1; i <= 300; i++) {
      if (!has[i]) {
        return i;
      }
    }
    return 301;
  }
}
