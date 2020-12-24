import java.util.HashMap;
import java.util.Map;

public class _0032LongestValidParentheses {
  public int longestValidParentheses(String s) {
    boolean[] valid = new boolean[s.length()];
    int count = 0;
    Map<Integer, Integer> indexes = new HashMap<>();
    for (int i = 0; i < s.length(); i++) {
      char c = s.charAt(i);
      if (c == '(') {
        count = Math.max(count, 0) + 1;
        indexes.putIfAbsent(count, i);
      } else {
        if (count == 0) {
          indexes.clear();
        } else {
          valid[i] = true;
          valid[indexes.get(count)] = true;
          indexes.remove(count);
          count--;
        }
      }
    }
    int longest = 0;
    int length = 0;
    for (boolean tf : valid) {
      if (tf) {
        length++;
        longest = Math.max(longest, length);
      } else {
        length = 0;
      }
    }
    return longest;
  }
}
