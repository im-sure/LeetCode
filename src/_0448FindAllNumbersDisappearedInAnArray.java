import java.util.ArrayList;
import java.util.List;

public class _0448FindAllNumbersDisappearedInAnArray {
  public List<Integer> findDisappearedNumbers(int[] nums) {
    for (int i = 0; i < nums.length; i++) {
      int n = nums[i];
      while (n != 0) {
        int next = nums[n - 1];
        nums[n - 1] = 0;
        n = next;
      }
    }
    List<Integer> res = new ArrayList<>();
    for (int i = 0; i < nums.length; i++) {
      if (nums[i] != 0) {
        res.add(i + 1);
      }
    }
    return res;
  }
}
