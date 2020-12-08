import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class _0017LetterCombinationsOfAPhoneNumber {
  public List<String> letterCombinations(String digits) {
    Map<Character, List<String>> letterMap = new HashMap<Character, List<String>>() {{
      put('2', Arrays.asList("a", "b", "c"));
      put('3', Arrays.asList("d", "e", "f"));
      put('4', Arrays.asList("g", "h", "i"));
      put('5', Arrays.asList("j", "k", "l"));
      put('6', Arrays.asList("m", "n", "o"));
      put('7', Arrays.asList("p", "q", "r", "s"));
      put('8', Arrays.asList("t", "u", "v"));
      put('9', Arrays.asList("w", "x", "y", "z"));
    }};
    List<String> res = new ArrayList<>();
    for (int i = 0; i < digits.length(); i++) {
      char c = digits.charAt(i);
      List<String> newRes = new ArrayList<>();
      if (res.isEmpty()) {
        newRes.addAll(letterMap.get(c));
      } else {
        for (String s : res) {
          for (String ch : letterMap.get(c)) {
            newRes.add(s + ch);
          }
        }
      }
      res = newRes;
    }
    return res;
  }
}
