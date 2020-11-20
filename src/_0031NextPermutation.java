import java.util.Arrays;

public class _0031NextPermutation {
  public void nextPermutation(int[] nums) {
    int length = nums.length;
    int max = Integer.MIN_VALUE;
    int index = length - 1;
    for (;index >= 0; index--) {
      if (nums[index] < max) {
        break;
      }
      max = nums[index];
    }
    if (index == -1) {
      Arrays.sort(nums);
      return;
    }
    int swapIndex = index;
    for (int i = swapIndex + 1; i < length; i++) {
      if (nums[i] > nums[index] && (swapIndex == index || nums[i] < nums[swapIndex])) {
        swapIndex = i;
      }
    }
    int tmp = nums[index];
    nums[index] = nums[swapIndex];
    nums[swapIndex] = tmp;
    Arrays.sort(nums, index + 1, length);
  }
}
