public class _0287FindTheDuplicateNumber {
  public int findDuplicate(int[] nums) {
    int slow = 0;
    int fast = 0;
    while (true) {
      slow = nums[slow];
      fast = nums[nums[fast]];
      if (slow == fast) {
        fast = 0;
        while (nums[slow] != nums[fast]) {
          slow = nums[slow];
          fast = nums[fast];
        }
        return nums[slow];
      }
    }
  }
}
