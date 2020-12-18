public class _0055JumpGame {
  public boolean canJump(int[] nums) {
    int length = nums.length;
    boolean[] can = new boolean[length];
    can[0] = true;
    for (int i = 0; i < length; i++) {
      if (!can[i]) {
        continue;
      }
      int step = nums[i];
      for (int j = 1; j <= step; j++) {
        if (i + j >= length) {
          break;
        }
        can[i + j] = true;
      }
    }
    return can[length - 1];
  }
}
