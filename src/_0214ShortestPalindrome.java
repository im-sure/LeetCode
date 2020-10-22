public class _0214ShortestPalindrome {
  public String shortestPalindrome(String s) {
    String reverse = new StringBuilder(s).reverse().toString();
    for (int i = 0; i <= s.length(); i++) {
      if (s.startsWith(reverse.substring(i))) {
        return reverse.substring(0, i) + s;
      }
    }
    return "";
  }
}
