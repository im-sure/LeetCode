public class _0467UniqueSubstringsInWraparoundString {
  public int findSubstringInWraproundString(String p) {
    int[] longest = new int[26];
    int n = 0;
    for (int i = 0; i < p.length(); i++) {
      if (i == 0 || p.charAt(i) - p.charAt(i - 1) == 1 || (p.charAt(i) == 'a' && p.charAt(i - 1) == 'z')) {
        n++;
      } else {
        n = 1;
      }
      longest[p.charAt(i) - 'a'] = Math.max(longest[p.charAt(i) - 'a'], n);
    }
    int res = 0;
    for (int l : longest) {
      res += l;
    }
    return res;
  }
}
