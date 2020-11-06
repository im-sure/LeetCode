import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class _0301RemoveInvalidParentheses {
  public List<String> removeInvalidParentheses(String s) {
    if (s == null || s.isEmpty()) {
      return Arrays.asList("");
    }
    if (isValid(s)) {
      return Arrays.asList(s);
    }
    Set<String> strs = new HashSet<>();
    strs.add(s);
    int length = s.length();
    int l = 0;
    while (l < length) {
      Set<String> tmp = new HashSet<>();
      Set<String> res = new HashSet<>();
      for (String str : strs) {
        for (int i = 0; i < length - l; i++) {
          StringBuilder sb = new StringBuilder(str);
          String newStr = sb.deleteCharAt(i).toString();
          if (isValid(newStr)) {
            res.add(newStr);
          } else {
            tmp.add(newStr);
          }
        }
      }
      if (!res.isEmpty()) {
        return new ArrayList<>(res);
      } else {
        strs = tmp;
      }
      l++;
    }
    return Arrays.asList("");
  }

  private boolean isValid(String s) {
    int count = 0;
    for (int i = 0; i < s.length(); i++) {
      if (s.charAt(i) == '(') {
        count++;
      } else if (s.charAt(i) == ')') {
        count--;
        if (count < 0) {
          return false;
        }
      }
    }
    return count == 0;
  }
}
