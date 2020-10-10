public class _0680ValidPalindromeII {
    public boolean validPalindrome(String s) {
      int length = s.length();
      if (length <= 2) {
        return true;
      }
      int size = length % 2 == 0 ? length / 2 : length / 2 + 1;
      boolean mid = false, left = false, right = false;
      for (int i = 0; i < size; i++) {
        if (i > 0 && i == size - 1) {
          return true;
        }
        boolean tmpMid = s.charAt(i) == s.charAt(length - i - 1);
        boolean tmpLeft = s.charAt(i + 1) == s.charAt(length - i - 1);
        boolean tmpRight = s.charAt(i) == s.charAt(length - i - 2);
        if (i > 0) {
          tmpMid = tmpMid && mid;
          tmpLeft = tmpLeft && (left || mid);
          tmpRight = tmpRight && (right || mid);
        }
        mid = tmpMid;
        left = tmpLeft;
        right = tmpRight;
        if (!(mid || left || right)) {
          return false;
        }
      }
      return true;
    }
}
