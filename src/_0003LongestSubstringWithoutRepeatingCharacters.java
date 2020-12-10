import java.util.HashMap;
import java.util.Map;

public class _0003LongestSubstringWithoutRepeatingCharacters {
  public int lengthOfLongestSubstring(String s) {
    int longest = 0;
    int start = 0;
    Map<Character, Integer> indexes = new HashMap<>();
    for (int i = 0; i < s.length(); i++) {
      char c = s.charAt(i);
      if (indexes.containsKey(c)) {
        start = start > indexes.get(c) ? start : indexes.get(c) + 1;
      }
      indexes.put(c, i);
      longest = Math.max(longest, i - start + 1);
    }
    return longest;
  }
}
