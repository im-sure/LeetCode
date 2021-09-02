import java.util.ArrayList;
import java.util.List;

public class _0043MultiplyStrings {
  public String multiply(String num1, String num2) {
    if (num1.equals("0") || num2.equals("0")) {
      return "0";
    }
    int l1 = num1.length();
    int l2 = num2.length();
    List<String> products = new ArrayList<>();
    int maxL = 0;
    for (int i = l1 - 1; i >= 0; i--) {
      int n = num1.charAt(i) - '0';
      int c = 0;
      StringBuilder sb = new StringBuilder();
      for (int k = 0; k < l1 - i - 1; k++) {
        sb.append('0');
      }
      for (int j = l2 - 1; j >= 0; j--) {
        int m = num2.charAt(j) - '0';
        c += n * m;
        sb.append(c % 10);
        c /= 10;
      }
      if (c != 0) {
        sb.append(c);
      }
      maxL = Math.max(maxL, sb.length());
      products.add(sb.reverse().toString());
    }
    int i = 1;
    int c = 0;
    StringBuilder sb = new StringBuilder();
    while (i <= maxL) {
      for (String s : products) {
        if (s.length() < i) {
          continue;
        }
        c += s.charAt(s.length() - i) - '0';
      }
      sb.append(c % 10);
      c /= 10;
      i++;
    }
    while (c != 0) {
      sb.append(c % 10);
      c /= 10;
    }
    return sb.reverse().toString();
  }
}
