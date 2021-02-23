public class _0557ReverseWordsInAStringIII {
  public String reverseWords(String s) {
    int start = 0;
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < s.length(); i++) {
      if (s.charAt(i) == ' ') {
        if (start < i) {
          sb.append(new StringBuilder(s.substring(start, i)).reverse());
        }
        sb.append(' ');
        start = i + 1;
      } else if (i == s.length() - 1) {
        sb.append(new StringBuilder(s.substring(start, i + 1)).reverse());
      }
    }
    return sb.toString();
  }
}
