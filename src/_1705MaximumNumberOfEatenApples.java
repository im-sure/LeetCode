import java.util.ArrayList;
import java.util.List;

public class _1705MaximumNumberOfEatenApples {
  public int eatenApples(int[] apples, int[] days) {
    List<Integer> order = new ArrayList<>();
    int length = apples.length;
    int n = 0;
    int i = 0;
    while (i < length || !order.isEmpty()) {
      if (i < length && apples[i] != 0) {
        days[i] += i - 1;
        int j = 0;
        for (; j < order.size(); j++) {
          if (days[order.get(j)] > days[i]) {
            order.add(j, i);
            break;
          }
        }
        if (j == order.size()) {
          order.add(i);
        }
      }
      if (!order.isEmpty()) {
        n++;
        apples[order.get(0)]--;
        while (!order.isEmpty()) {
          if (apples[order.get(0)] == 0 || days[order.get(0)] == i) {
            order.remove(0);
          } else {
            break;
          }
        }
      }
      i++;
    }
    return n;
  }
}
