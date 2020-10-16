public class _1163LastSubstringInLexicographicalOrder {
  public String lastSubstring(String s) {
    int left = 0;
    int right = 1;
    int step = 0;
    while (right + step < s.length()) {
      if (s.charAt(left) > s.charAt(right) ||
          (s.charAt(left + step) > s.charAt(right + step))) {
        right += 1;
        step = 0;
      } else if (s.charAt(left) < s.charAt(right) ||
          (s.charAt(left + step) < s.charAt(right + step))) {
        left = right;
        right += 1;
        step = 0;
      } else {
        step += 1;
      }
    }
    return s.substring(left);
  }
}
