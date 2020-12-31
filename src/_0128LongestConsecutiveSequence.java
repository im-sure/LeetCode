import java.util.HashMap;
import java.util.Map;

public class _0128LongestConsecutiveSequence {
  public int longestConsecutive(int[] nums) {
    Map<Integer, Integer> map = new HashMap<>();
    for (int num : nums) {
      map.put(num, 0);
    }
    int longest = 0;
    for (int key : map.keySet()) {
      if (map.get(key) > 0) {
        continue;
      }
      int length = 1;
      int tmpKey = key + 1;
      while (map.containsKey(tmpKey)) {
        if (map.get(tmpKey) > 0) {
          length += map.get(tmpKey);
          break;
        }
        length++;
        map.put(tmpKey, 1);
        tmpKey++;
      }
      map.put(key, length);
      if (length > longest) {
        longest = length;
      }
    }
    return longest;
  }
}
