public class _0080RemoveDuplicatesFromSortedArrayII {
  public int removeDuplicates(int[] nums) {
    int len = nums.length;
    int duplicates = 0;
    int i = 0;
    int j = 0;
    while (i < len) {
      int n = 0;
      while (i + n < len && nums[i + n] == nums[i]) {
        if (n < 2) {
          nums[j++] = nums[i + n];
        }
        n++;
      }
      duplicates += n > 2 ? n - 2 : 0;
      i = i + n;
    }
    return len - duplicates;
  }
}
