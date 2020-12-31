public class _0647PalindromicSubstrings {
  public int countSubstrings(String s) {
    int count = 0;
    for (int i = 0; i < s.length(); i++) {
      count += count(s, i, i);
      count += count(s, i, i + 1);
    }
    return count;
  }

  private int count(String s, int start, int end) {
    int count = 0;
    while (start >= 0 && end < s.length() && s.charAt(start) == s. charAt(end)) {
      count++;
      start--;
      end++;
    }
    return count;
  }
}
