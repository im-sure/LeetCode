import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class _0560SubarraySumEqualsK {
  public int subarraySum(int[] nums, int k) {
    int[] sums = new int[nums.length];
    Map<Integer, List<Integer>> indexes = new HashMap<>();
    int sum = 0;
    int res = 0;
    for (int i = 0; i < nums.length; i++) {
      sum += nums[i];
      if (sum == k) {
        res++;
      }
      int diff = sum - k;
      if (indexes.containsKey(diff)) {
        res += indexes.get(diff).size();
      }
      sums[i] = sum;
      if (!indexes.containsKey(sum)) {
        indexes.put(sum, new ArrayList<>());
      }
      indexes.get(sum).add(i);
    }
    return res;
  }
}
