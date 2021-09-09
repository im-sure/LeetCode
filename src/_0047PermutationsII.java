import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class _0047PermutationsII {
  private List<List<Integer>> res;

  public List<List<Integer>> permuteUnique(int[] nums) {
    res = new ArrayList<>();
    permute(nums, 0, nums.length);
    return res;
  }

  private void permute(int[] nums, int start, int end) {
    if (start == end - 1) {
      res.add(Arrays.stream(nums).boxed().collect(Collectors.toList()));
      return;
    }
    Set<Integer> swapped = new HashSet<>();
    swapped.add(nums[start]);
    for (int i = start; i < end; i++) {
      if (i != start && swapped.contains(nums[i])) {
        continue;
      }
      swapped.add(nums[i]);
      swap(nums, start, i);
      permute(nums, start + 1, end);
      swap(nums, start, i);
    }
  }

  private void swap(int[] nums, int i, int j) {
    int tmp = nums[i];
    nums[i] = nums[j];
    nums[j] = tmp;
  }
}
