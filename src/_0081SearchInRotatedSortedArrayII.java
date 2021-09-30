public class _0081SearchInRotatedSortedArrayII {
  public boolean search(int[] nums, int target) {
    if (nums.length == 1) {
      return nums[0] == target;
    }
    int l = 0;
    int r = nums.length - 1;
    while (l < r) {
      int mid = (l + r + 1) / 2;
      if (nums[l] == target || nums[r] == target || nums[mid] == target) {
        return true;
      }
      if ((l < mid && nums[l] == nums[mid]) || (r > mid && nums[r] == nums[mid])) {
        while (l < mid && nums[l] == nums[mid]) {
          l++;
        }
        if (nums[l] == target) {
          return true;
        }
        while (r > mid && nums[r] == nums[mid]) {
          r--;
        }
        if (nums[r] == target) {
          return true;
        }
        continue;
      }
      if (nums[mid] > nums[l]) {
        if (target > nums[l] && target < nums[mid]) {
          r = mid - 1;
        } else {
          l = mid + 1;
        }
      } else {
        if (target > nums[mid] && target < nums[r]) {
          l = mid + 1;
        } else {
          r = mid - 1;
        }
      }
    }
    return false;
  }
}
