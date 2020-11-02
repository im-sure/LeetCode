public class _0005LongestPalindromicSubstring {
  public String longestPalindrome(String s) {
    int length = s.length();
    boolean[][] dp = new boolean[length][length];
    String res = "";
    for (int l = 0; l < length; l++) {
      for (int m = l / 2; m < length - (l + 1) / 2; m++) {
        int left = m - l / 2;
        int right = m + l / 2 + (l % 2 == 0 ? 0 : 1);
        if (left == right) {
          dp[left][right] = true;
        } else if (left == right - 1) {
          dp[left][right] = s.charAt(left) == s.charAt(right);
        } else {
          dp[left][right] = dp[left + 1][right - 1] && s.charAt(left) == s.charAt(right);
        }
        if (dp[left][right] && right - left + 1 > res.length()) {
          res = s.substring(left, right + 1);
        }
      }
    }
    return res;
  }
}
