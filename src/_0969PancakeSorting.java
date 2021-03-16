import java.util.ArrayList;
import java.util.List;

public class _0969PancakeSorting {
  public List<Integer> pancakeSort(int[] arr) {
    List<Integer> res = new ArrayList<>();
    for (int n = arr.length; n > 0; n--) {
      for (int i = n - 1; i >= 0; i--) {
        if (arr[i] == n) {
          if (i == n - 1) {
            break;
          } else if (i == 0) {
            res.add(n);
            reverse(arr, n);
          } else {
            int bound = i + 1;
            res.add(bound);
            reverse(arr, bound);
            res.add(n);
            reverse(arr, n);
          }
        }
      }
    }
    return res;
  }

  private void reverse(int[] arr, int bound) {
    for (int i = 0; i < bound / 2; i++) {
      int tmp = arr[i];
      arr[i] = arr[bound - 1 - i];
      arr[bound - 1 - i] = tmp;
    }
  }
}
