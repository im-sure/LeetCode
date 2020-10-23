public class _0581ShortestUnsortedContinuousSubarray {
  public int findUnsortedSubarray(int[] nums) {
    int max = Integer.MIN_VALUE;
    int unsortedStartIndex = 0;
    int unsortedMin = Integer.MAX_VALUE;
    int unsortedEndIndex = 0;
    for (int i = 0; i < nums.length; i++) {
      int n = nums[i];
      if (n >= max) {
        max = n;
      } else {
        unsortedEndIndex = i;
        if (unsortedStartIndex == 0) {
          unsortedStartIndex = i;
        }
        if (n < unsortedMin) {
          unsortedMin = n;
        }
      }
    }
    if (unsortedStartIndex != 0) {
      for (int i = 0; i < unsortedStartIndex; i++) {
        int n = nums[i];
        if (n > unsortedMin) {
          unsortedStartIndex = i;
          break;
        }
      }
    }
    return unsortedEndIndex == 0 ? 0 : unsortedEndIndex - unsortedStartIndex + 1;
  }
}
