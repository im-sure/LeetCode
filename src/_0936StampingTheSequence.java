import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class _0936StampingTheSequence {
  public int[] movesToStamp(String stamp, String target) {
    List<Integer> result = new ArrayList<>();
    while (target.split("\\.").length != 0) {
      int index = match(stamp, target);
      if (index != -1) {
        result.add(0, index);
        StringBuilder sb = new StringBuilder(target);
        for (int i = index; i < index + stamp.length(); i++) {
          sb.replace(i, i + 1, ".");
        }
        target = sb.toString();
      } else {
        return new int[0];
      }
    }
    int[] res = new int[result.size()];
    for (int i = 0; i < result.size(); i++) {
      res[i] = result.get(i);
    }
    return res;
  }

  private int match(String stamp, String target) {
    for (int i = 0; i <= target.length() - stamp.length(); i++) {
      String pattern = target.substring(i, i + stamp.length());
      if (pattern.split("\\.").length != 0) {
        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(stamp);
        if (m.matches()) {
          return i;
        }
      }
    }
    return -1;
  }
}
