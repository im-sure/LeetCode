public class _0034FindFirstAndLastPositionOfElementInSortedArray {
  public int[] searchRange(int[] nums, int target) {
    if (nums == null || nums.length == 0) {
      return new int[]{-1, -1};
    }
    return binarySearch(nums, target, 0, nums.length);
  }

  private int[] binarySearch(int[] nums, int target, int start, int end) {
    int[] res = {-1, -1};
    int mid = (start + end) / 2;
    if (nums[mid] == target) {
      res = new int[]{mid, mid};
    }
    if (mid > start && (nums[mid - 1] == target || nums[mid] > target)) {
      int[] leftRes = binarySearch(nums, target, start, mid);
      res[0] = res[0] == -1 ? leftRes[0] : Math.min(res[0], leftRes[0]);
      res[1] = res[1] == -1 ? leftRes[1] : res[1];
    }
    if (mid + 1 < end && (nums[mid + 1] == target || nums[mid] < target)) {
      int[] rightRes = binarySearch(nums, target, mid + 1, end);
      res[0] = res[0] == -1 ? rightRes[0] : res[0];
      res[1] = res[1] == -1 ? rightRes[1] : Math.max(res[1], rightRes[1]);
    }
    return res;
  }
}
