import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class _0990SatisfiabilityOfEqualityEquations {
  public boolean equationsPossible(String[] equations) {
    int tag = 0;
    Map<Integer, Set<Character>> tagChar = new HashMap<>();
    Map<Character, Integer> charTag = new HashMap<>();
    Map<Character, Set<Character>> inequality = new HashMap<>();
    for (String equation : equations) {
      char arg1 = equation.charAt(0);
      if (!charTag.containsKey(arg1)) {
        charTag.put(arg1, ++tag);
        tagChar.put(tag, new HashSet<>(Arrays.asList(arg1)));
        inequality.put(arg1, new HashSet<>());
      }
      char arg2 = equation.charAt(3);
      if (!charTag.containsKey(arg2)) {
        charTag.put(arg2, ++tag);
        tagChar.put(tag, new HashSet<>(Arrays.asList(arg2)));
        inequality.put(arg2, new HashSet<>());
      }
      int t1 = charTag.get(arg1);
      int t2 = charTag.get(arg2);
      switch (equation.charAt(1)) {
        case '=':
          if (charTag.get(arg1) != charTag.get(arg2)) {
            Set<Character> chars = tagChar.get(t2);
            for (char ch : chars) {
              for (char in : inequality.get(ch)) {
                if (charTag.get(in) == t1) {
                  return false;
                }
              }
              charTag.put(ch, t1);
              tagChar.get(t1).add(ch);
            }
            tagChar.remove(t2);
          }
          break;
        case '!':
          if (charTag.get(arg1) == charTag.get(arg2)) {
            return false;
          } else {
            inequality.get(arg1).add(arg2);
            inequality.get(arg2).add(arg1);
          }
          break;
      }
    }
    return true;
  }
}
