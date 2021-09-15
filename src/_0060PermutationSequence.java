public class _0060PermutationSequence {
  public String getPermutation(int n, int k) {
    if (n == 1) {
      return "1";
    }
    int[] nums = new int[n];
    int[] factorials = new int[n];
    int factorial = 1;
    for (int i = 0; i < n; i++) {
      nums[i] = i + 1;
      factorial *= i + 1;
      factorials[i] = factorial;
    }
    permute(n, k, nums, 0, 1, factorials);
    StringBuilder sb = new StringBuilder();
    for (int num : nums) {
      sb.append(num);
    }
    return sb.toString();
  }

  private void permute(int n, int k, int[] nums, int start, int order, int[] factorials) {
    if (order == k) {
      return;
    }
    int factorial = factorials[n - start - 2];
    for (int i = start; i < n; i++) {
      if (order <= k && (order + factorial - 1 >= k || i == n - 1)) {
        int m = nums[i];
        for (int j = i; j > start; j--) {
          nums[j] = nums[j - 1];
        }
        nums[start] = m;
        permute(n, k, nums, start + 1, order, factorials);
        break;
      } else {
        order += factorial;
      }
    }
  }
}
