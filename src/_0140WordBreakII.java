import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class _0140WordBreakII {
  public List<String> wordBreak(String s, List<String> wordDict) {
    Set<String> wordSet = new HashSet<>(wordDict);
    Map<String, List<String>> map = new HashMap<>();
    return subWordBreak(s, 0, s.length(), wordSet, map);
  }

  private List<String> subWordBreak(String s, int start, int end, Set<String> wordSet, Map<String, List<String>> map) {
    String key = start + " " + end;
    if (map.containsKey(key)) {
      return map.get(key);
    }
    List<String> breaks = new ArrayList<>();
    for (int i = start; i < end; i++) {
      String prefix = s.substring(start, i + 1);
      if (wordSet.contains(prefix)) {
        if (i == s.length() - 1) {
          breaks.add(prefix);
        } else {
          List<String> suffixes = subWordBreak(s, i + 1, end, wordSet, map);
          if (suffixes.isEmpty()) {
            continue;
          } else {
            for (String suffix : suffixes) {
              breaks.add(prefix + " " + suffix);
            }
          }
        }
      }
    }
    map.put(key, breaks);
    return breaks;
  }
}
