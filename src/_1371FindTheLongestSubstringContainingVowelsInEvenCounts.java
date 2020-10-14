import java.util.HashMap;
import java.util.Map;

public class _1371FindTheLongestSubstringContainingVowelsInEvenCounts {
  public int findTheLongestSubstring(String s) {
    Map<Integer, Integer> states = new HashMap<>();
    int state = 0;
    int max = 0;
    states.put(0, -1);
    for (int i = 0; i < s.length(); i++) {
      char c = s.charAt(i);
      if ("aeiou".contains(String.valueOf(c))) {
        state ^= (int) c;
      }
      if (states.containsKey(state)) {
        max = Math.max(max, i - states.get(state));
      }
      states.putIfAbsent(state, i);
    }
    return max;
  }
}
