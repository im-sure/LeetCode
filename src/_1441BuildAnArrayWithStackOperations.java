import java.util.ArrayList;
import java.util.List;

public class _1441BuildAnArrayWithStackOperations {
  public List<String> buildArray(int[] target, int n) {
    List<String> res = new ArrayList<>();
    int i = 1;
    for (int num : target) {
      while (i < num) {
        res.add("Push");
        res.add("Pop");
        i++;
      }
      res.add("Push");
      i++;
    }
    return res;
  }
}
