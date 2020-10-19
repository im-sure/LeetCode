public class _0709ToLowerCase {
  public String toLowerCase(String str) {
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < str.length(); i++) {
      char c = str.charAt(i);
      int ascii = (int) c;
      if (ascii >= 65 && ascii <= 90) {
        sb.append((char) (ascii + 32));
      } else {
        sb.append(c);
      }
    }
    return sb.toString();
  }
}
