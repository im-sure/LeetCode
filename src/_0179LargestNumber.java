import java.util.Arrays;
import java.util.Comparator;

public class _0179LargestNumber {
  public String largestNumber(int[] nums) {
    String[] sorted = new String[nums.length];
    for (int i = 0; i < nums.length; i++) {
      sorted[i] = String.valueOf(nums[i]);
    }
    Arrays.sort(sorted, new Comparator<String>(){
      public int compare(String s1, String s2) {
        for (int i = 0; i < Math.max(s1.length(), s2.length()); i++) {
          if (i >= s1.length()) {
            return compare(s1, s2.substring(i));
          }
          if (i >= s2.length()) {
            return compare(s1.substring(i), s2);
          }
          if (s1.charAt(i) != s2.charAt(i)) {
            return s1.charAt(i) > s2.charAt(i) ? -1 : 1;
          }
        }
        return 0;
      }
    });
    StringBuilder sb = new StringBuilder();
    for (String num : sorted) {
      sb.append(num);
    }
    String res = sb.toString();
    return res.charAt(0) == '0' ? "0" : res;
  }
}
