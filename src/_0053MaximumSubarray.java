public class _0053MaximumSubarray {
  public int maxSubArray(int[] nums) {
    int max = Integer.MIN_VALUE;
    int tmp = 0;
    for (int n : nums) {
      tmp += n;
      if (tmp > max) {
        max = tmp;
      }
      if (tmp < 0) {
        tmp = 0;
      }
    }
    return max;
  }
}
