import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class _0076MinimumWindowSubstring {
  public String minWindow(String s, String t) {
    if (s.length() < t.length()) {
      return "";
    }
    Map<Character, Integer> charMap = new HashMap<>();
    for (int i = 0; i < t.length(); i++) {
      char c = t.charAt(i);
      charMap.put(c, charMap.getOrDefault(c, 0) + 1);
    }
    Set<Character> leftChars = new HashSet<>(charMap.keySet());
    int start = -1;
    String res = "";
    for (int i = 0; i < s.length(); i++) {
      char c = s.charAt(i);
      if (charMap.containsKey(c)) {
        if (start == -1 && res.isEmpty()) {
          start = i;
        }
        int n = charMap.get(c) - 1;
        charMap.put(c, n);
        if (n <= 0) {
          leftChars.remove(c);
          if (leftChars.isEmpty()) {
            res = (res.isEmpty() || i + 1 - start < res.length()) ? s.substring(start, i + 1) : res;
            for (int j = start; j < i; j++) {
              char c2 = s.charAt(j);
              if (charMap.containsKey(c2)) {
                int m = charMap.get(c2) + 1;
                if (m > 0) {
                  break;
                }
                charMap.put(c2, m);
              }
              start++;
              res = i + 1 - start < res.length() ? s.substring(start, i + 1) : res;
            }
          }
        }
      }
    }
    return res;
  }
}
