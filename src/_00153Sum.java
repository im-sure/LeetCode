import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class _00153Sum {
  public List<List<Integer>> threeSum(int[] nums) {
    Map<Integer, Integer> numMap = new HashMap<>();
    for (int num : nums) {
      numMap.put(num, numMap.getOrDefault(num, 0) + 1);
    }
    Arrays.sort(nums);
    List<List<Integer>> res = new ArrayList<>();
    int lastN1 = 0;
    for (int i = 0; i < nums.length - 2; i++) {
      int n1 = nums[i];
      if (n1 > 0) {
        break;
      }
      if (i > 0 && n1 == lastN1) {
        continue;
      }
      lastN1 = n1;
      int lastN2 = 0;
      for (int j = i + 1; j < nums.length - 1; j++) {
        int n2 = nums[j];
        if (j > i + 1 && n2 == lastN2) {
          continue;
        }
        lastN2 = n2;
        int diff = - n1 - n2;
        if (diff < n2) {
          break;
        }
        int count = numMap.getOrDefault(diff, 0);
        if (n1 == diff) {
          count--;
        }
        if (n2 == diff) {
          count --;
        }
        if (count > 0) {
          res.add(Arrays.asList(n1, n2, diff));
        }
      }
    }
    return res;
  }
}
