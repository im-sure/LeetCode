import java.util.Arrays;

public class _00163SumClosest {
  public int threeSumClosest(int[] nums, int target) {
    int interval = Integer.MAX_VALUE;
    Arrays.sort(nums);
    for (int first = 0; first < nums.length; first++) {
      int num = nums[first];
      int second = first + 1;
      int third = nums.length - 1;
      while (second < third) {
        int sum = num + nums[second] + nums[third];
        int diff = sum - target;
        if (Math.abs(diff) < Math.abs(interval)) {
          interval = diff;
        }
        if (diff < 0) {
          second++;
        } else if (diff > 0) {
          third--;
        } else {
          return target;
        }
      }
    }
    return target + interval;
  }
}
