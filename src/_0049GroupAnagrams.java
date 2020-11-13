import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class _0049GroupAnagrams {
  public List<List<String>> groupAnagrams(String[] strs) {
    Map<String, List<String>> map = new HashMap<>();
    for (String str : strs) {
      int[] chars = new int[26];
      for (int i = 0; i < str.length(); i++) {
        chars[str.charAt(i) - 97]++;
      }
      String hash = Arrays.toString(chars);
      if (!map.containsKey(hash)) {
        map.put(hash, new ArrayList<>());
      }
      map.get(hash).add(str);
    }
    return new ArrayList<>(map.values());
  }
}
