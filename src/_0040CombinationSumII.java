import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _0040CombinationSumII {
  public List<List<Integer>> combinationSum2(int[] candidates, int target) {
    Arrays.sort(candidates);
    return combine(candidates, target, 0);
  }

  private List<List<Integer>> combine(int[] candidates, int target, int start) {
    List<List<Integer>> res = new ArrayList<>();
    for (int i = start; i < candidates.length; i++) {
      if (i > start && candidates[i] == candidates[i - 1]) {
        continue;
      }
      if (candidates[i] > target) {
        break;
      } else if (candidates[i] == target) {
        res.add(new ArrayList<>(Arrays.asList(target)));
        break;
      } else {
        for (List<Integer> combination : combine(candidates, target - candidates[i], i + 1)) {
          combination.add(0, candidates[i]);
          res.add(combination);
        }
      }
    }
    return res;
  }
}
