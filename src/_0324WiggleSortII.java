import java.util.Arrays;

public class _0324WiggleSortII {
  public void wiggleSort(int[] nums) {
    Arrays.sort(nums);
    int length = nums.length;
    int[] res = new int[length];
    int mid = (length - 1) / 2;
    int left = mid;
    int right = length - 1;
    int index = 0;
    while (left >= 0 || right > mid) {
      res[index++] = nums[left--];
      if (right > mid) {
        res[index++] = nums[right--];
      }
    }
    for (int i = 0; i < length; i++) {
      nums[i] = res[i];
    }
  }
}
