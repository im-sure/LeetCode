import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class _0560SubarraySumEqualsK {
  public int subarraySum(int[] nums, int k) {
    int[] sums = new int[nums.length];
    Map<Integer, List<Integer>> indexes = new HashMap<>();
    int sum = 0;
    for (int i = 0; i < nums.length; i++) {
      sum += nums[i];
      sums[i] = sum;
      if (!indexes.containsKey(sum)) {
        indexes.put(sum, new ArrayList<>());
      }
      indexes.get(sum).add(i);
    }
    System.out.println(indexes);
    int res = 0;
    for (int i = 0; i < sums.length; i++) {
      int val = sums[i];
      if (val == k) {
        res++;
      }
      int diff = val - k;
      System.out.println("*******diff: " + diff);
      if (indexes.containsKey(diff)) {
        for (Integer index : indexes.get(diff)) {
          System.out.println("*******index: " + index);
          if (index < i) {
            res++;
          } else {
            break;
          }
        }
      }
    }
    return res;
  }
}
