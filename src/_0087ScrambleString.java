import java.util.HashMap;
import java.util.Map;

public class _0087ScrambleString {
  int[][][][] res;

  public boolean isScramble(String s1, String s2) {
    int length = s1.length() + 1;
    res = new int[length][length][length][length];
    return isScramble(s1, s2, 0, s1.length(), 0, s2.length());
  }

  private boolean isScramble(String s1, String s2, int start1, int end1, int start2, int end2) {
    if (res[start1][end1][start2][end2] != 0) {
      return res[start1][end1][start2][end2] == 1;
    }
    if (end1 - start1 == 1) {
      return s1.charAt(start1) == s2.charAt(start2);
    }
    for (int i = 1; i < end1 - start1; i++) {
      Map<Character, Integer> lm1 = stringMap(s1, start1, start1 + i);
      Map<Character, Integer> rm1 = stringMap(s1, start1 + i, end1);
      
      Map<Character, Integer> lm2 = stringMap(s2, start2, start2 + i);
      Map<Character, Integer> rm2 = stringMap(s2, start2 + i, end2);
      if (lm1.equals(lm2) && rm1.equals(rm2)) {
        if (isScramble(s1, s2, start1, start1 + i, start2, start2 + i) &&
            isScramble(s1, s2, start1 + i, end1, start2 + i, end2)) {
          res[start1][end1][start2][end2] = 1;
          return true;
        }
      }
      lm2 = stringMap(s2, end2 - i, end2);
      rm2 = stringMap(s2, start2, end2 - i);
      if (lm1.equals(lm2) && rm1.equals(rm2)) {
        if (isScramble(s1, s2, start1, start1 + i, end2 - i, end2) &&
            isScramble(s1, s2, start1 + i, end1, start2, end2 - i)) {
          res[start1][end1][start2][end2] = 1;
          return true;
        }
      }
    }
    res[start1][end1][start2][end2] = -1;
    return false;
  }

  private Map<Character, Integer> stringMap(String s, int start, int end) {
    Map<Character, Integer> m = new HashMap<>();
    for (int i = start; i < end; i++) {
      char c = s.charAt(i);
      m.put(c, m.getOrDefault(c, 0) + 1);
    }
    return m;
  }
}
