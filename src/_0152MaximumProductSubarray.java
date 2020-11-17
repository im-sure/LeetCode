public class _0152MaximumProductSubarray {
  public int maxProduct(int[] nums) {
    int max = Integer.MIN_VALUE;
    int start = 0;
    for (int i = 0; i < nums.length; i++) {
      if (nums[i] == 0) {
        max = Math.max(max, nums[i]);
        max = Math.max(max, max(nums, start, i));
        start = i + 1;
      } else if (i == nums.length - 1) {
        max = Math.max(max, max(nums, start, nums.length));
      }
    }
    return max;
  }

  private int max(int[] nums, int start, int end) {
    if (end - start <= 1) {
      return nums[start];
    }
    int negs = 0;
    int max = 0;
    for (int i = start; i < end; i++) {
      if (nums[i] < 0) {
        negs++;
      }
      if (max == 0) {
        max = nums[i];
      } else {
        max *= nums[i];
      }
    }
    if (negs % 2 != 0) {
      int n = 0;
      int tmp = 0;
      for (int i = start; i < end; i++) {
        if (nums[i] < 0) {
          n++;
        }
        if (tmp == 0) {
          tmp = nums[i];
        } else {
          if (n == negs) {
            break;
          }
          tmp *= nums[i];
        }
      }
      max = Math.max(max, tmp);
      n = 0;
      tmp = 0;
      for (int i = start; i < end; i++) {
        if (n < 1) {
          if (nums[i] < 0) {
            n++;
          }
          continue;
        } else {
          if (tmp == 0) {
            tmp = nums[i];
          } else {
            tmp *= nums[i];
          }
        }
      }
      max = Math.max(max, tmp);
    }
    return max;
  }
}
