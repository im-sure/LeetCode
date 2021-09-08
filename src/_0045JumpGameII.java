public class _0045JumpGameII {
  public int jump(int[] nums) {
    if(nums.length == 1) return 0;
    int currentI = 0;
    int nextI = 0;
    int step = 0;
    for (int i = 0; i < nums.length; i++) {
      if (currentI + nums[currentI] >= nums.length - 1) {
        return step + 1;
      }
      if (i + nums[i] > nextI + nums[nextI]) {
        nextI = i;
      }
      if (currentI + nums[currentI] == i) {
        currentI = nextI;
        step++;
      }
    }
    return step;
  }
}
