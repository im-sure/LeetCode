public class _0540SingleElementInASortedArray {
  public int singleNonDuplicate(int[] nums) {
    return bs(nums, 0, nums.length);
  }

  private int bs(int[] nums, int start, int end) {
    int mid = (start + end) / 2;
    if (!preSame(nums, mid) && !postSame(nums, mid)) {
      return nums[mid];
    }
    if ((mid % 2 == 0) == preSame(nums, mid)) {
      return bs(nums, start, mid);
    } else {
      return bs(nums, mid, end);
    }
  }

  private boolean preSame(int[] nums, int i) {
    return i != 0 && nums[i] == nums[i - 1];
  }

  private boolean postSame(int[] nums, int i) {
    return i != nums.length - 1 && nums[i] == nums[i + 1];
  }
}
