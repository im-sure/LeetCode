import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class _00184Sum {
  public List<List<Integer>> fourSum(int[] nums, int target) {
    if (nums == null || nums.length < 4) {
      return new ArrayList<>();
    }
    Arrays.sort(nums);
    List<List<Integer>> res = new ArrayList<>();
    for (int second = 1; second < nums.length - 2; second++) {
      for (int first = 0; first < second; first++) {
        int residual = target - nums[first] - nums[second];
        List<List<Integer>> twoRes = twoSum(nums, residual, second + 1);
        for (List<Integer> group : twoRes) {
          group.add(nums[first]);
          group.add(nums[second]);
          boolean equal = false;
          for (List<Integer> g : res) {
            if (listEqual(g, group)) {
              equal = true;
              break;
            }
          }
          if (!equal) {
            res.add(group);
          }
        }
      }
    }
    return res;
  }

  private List<List<Integer>> twoSum(int[] nums, int target, int start) {
    List<List<Integer>> res = new ArrayList<>();
    int l = start;
    int r = nums.length - 1;
    while (l < r) {
      if ((nums[l] + nums[r]) == target) {
        List<Integer> group = new ArrayList<>();
        group.add(nums[l]);
        group.add(nums[r]);
        boolean equal = false;
        for (List<Integer> g : res) {
          if (listEqual(g, group)) {
            equal = true;
            break;
          }
        }
        if (!equal) {
          res.add(group);
        }
      }
      if ((nums[l] + nums[r]) >= target) {
        r--;
      } else {
        l++;
      }
    }
    return res;
  }

  private boolean listEqual(List<Integer> l1, List<Integer> l2) {
    Map<Integer, Integer> m1 = new HashMap<>();
    for (Integer n : l1) {
      m1.put(n, m1.getOrDefault(n, 0) + 1);
    }
    Map<Integer, Integer> m2 = new HashMap<>();
    for (Integer n : l2) {
      m2.put(n, m2.getOrDefault(n, 0) + 1);
    }
    return m1.equals(m2);
  }
}
