public class _0033SearchInRotatedSortedArray {
  public int search(int[] nums, int target) {
    return binarySearch(nums, 0, nums.length, target);
  }

  private int binarySearch(int[] nums, int left, int right, int target) {
    if (left >= right) {
      return -1;
    }
    int mid = (left + right) / 2;
    if (target == nums[mid]) {
      return mid;
    }
    if (nums[left] < nums[right - 1]) {
      if (target < nums[left] || target > nums[right - 1]) {
        return -1;
      } else if (target < nums[mid]) {
        return binarySearch(nums, left, mid, target);
      } else {
        return binarySearch(nums, mid + 1, right, target);
      }
    } else {
      if (nums[mid] > nums[left]) {
        if (target < nums[left] || target > nums[mid]) {
          return binarySearch(nums, mid + 1, right, target);
        } else {
          return binarySearch(nums, left, mid, target);
        }
      } else {
        if (target > nums[right - 1] || target < nums[mid]) {
          return binarySearch(nums, left, mid, target);
        } else {
          return binarySearch(nums, mid + 1, right, target);
        }
      }
    }
  }
}
