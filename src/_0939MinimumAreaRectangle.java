import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.Map.Entry;

public class _0939MinimumAreaRectangle {
  public int minAreaRect(int[][] points) {
    Map<Integer, Map<Integer, Boolean>> xMap = new TreeMap<>();
    for (int i = 0; i < points.length; i++) {
      if (!xMap.containsKey(points[i][0])) {
        xMap.put(points[i][0], new TreeMap<>());
      }
      Map<Integer, Boolean> yValues = xMap.get(points[i][0]);
      yValues.put(points[i][1], true);
    }
    int min = Integer.MAX_VALUE;
    List<Entry<Integer, Map<Integer, Boolean>>> xEntries = new ArrayList<>(xMap.entrySet());
    for (int i = 0; i < xEntries.size() - 1; i++) {
      Entry<Integer, Map<Integer, Boolean>> leftEntries = xEntries.get(i);
      for (int j = i + 1; j < xEntries.size(); j++) {
        Entry<Integer, Map<Integer, Boolean>> rightEntries = xEntries.get(j);
        Map<Integer, Boolean> RightYValues = rightEntries.getValue();
        List<Entry<Integer, Boolean>> yEntries = new ArrayList<>(leftEntries.getValue().entrySet());
        for (int m = 0; m < yEntries.size() - 1; m++) {
          Entry<Integer, Boolean> bottemLeftEntry = yEntries.get(m);
          for (int n = m + 1; n < yEntries.size(); n++) {
            Entry<Integer, Boolean> topLeftEntry = yEntries.get(n);
            if (RightYValues.containsKey(bottemLeftEntry.getKey()) &&
                RightYValues.containsKey(topLeftEntry.getKey())) {
              min = Math.min(min,
                  (rightEntries.getKey() - leftEntries.getKey()) * (topLeftEntry.getKey() - bottemLeftEntry.getKey()));
            }
          }
        }
      }
    }
    return min == Integer.MAX_VALUE ? 0 : min;
  }
}
