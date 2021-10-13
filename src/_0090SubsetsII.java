import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _0090SubsetsII {
  public List<List<Integer>> subsetsWithDup(int[] nums) {
    Arrays.sort(nums);
    List<List<Integer>> res = subsetsWithDup(nums, 0, new ArrayList<>());
    res.add(new ArrayList<>());
    return res;
  }

  private List<List<Integer>> subsetsWithDup(int[] nums, int start, List<Integer> l) {  
    List<List<Integer>> res = new ArrayList<>();
    for (int i = start; i < nums.length; i++) {
      if (i > start && nums[i] == nums[i - 1]) {
        continue;
      }
      l.add(nums[i]);
      res.add(new ArrayList<>(l));
      if (i < nums.length - 1) {
        res.addAll(subsetsWithDup(nums, i + 1, l));
      }
      l.remove(l.size() - 1);
    }
    return res;
  }
}
