public class _0035SearchInsertPosition {
  public int searchInsert(int[] nums, int target) {
    int start = 0;
    int end = nums.length;
    int mid = end / 2;
    while (start < end) {
      mid = (start + end) / 2;
      if (nums[mid] == target) {
        return mid;
      }
      if (start == end - 1) {
        if (nums[mid] > target) {
          return mid;
        } else {
          return mid + 1;
        }
      }
      if (nums[mid] > target) {
        end = mid;
      } else {
        start = mid;
      }
    }
    return 0;
  }
}
