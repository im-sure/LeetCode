import java.util.ArrayList;
import java.util.List;

public class _0131PalindromePartitioning {
  public List<List<String>> partition(String s) {
    int length = s.length();
    int[][] isPalindrome = new int[length + 1][length + 1];
    List<List<String>> res = new ArrayList<>();
    partition(s, 0, isPalindrome, res, new ArrayList<>());
    return res;
  }

  private void partition(String s, int start, int[][] isPalindrome, List<List<String>> res, List<String> cur) {
    if (isPalindrome[start][s.length()] == 0) {
      isPalindrome[start][s.length()] = isPalindrome(s.substring(start)) ? 1 : 2;
    }
    if (isPalindrome[start][s.length()] == 1) {
      List<String> newL = new ArrayList<>(cur);
      newL.add(s.substring(start));
      res.add(newL);
    }
    if (start < s.length() - 1) {
      for (int i = start + 1; i < s.length(); i++) {
        List<String> newL = new ArrayList<>(cur);
        if (isPalindrome[start][i] == 0) {
          isPalindrome[start][i] = isPalindrome(s.substring(start, i)) ? 1 : 2;
        }
        if (isPalindrome[start][i] == 1) {
          newL.add(s.substring(start, i));
          partition(s, i, isPalindrome, res, newL);
        }
      }
    }
  }

  private boolean isPalindrome(String s) {
    int i = 0; 
    int j = s.length() - 1;
    while (i < j) {
      if (s.charAt(i) != s.charAt(j)) {
        return false;
      }
      i++;
      j--;
    }
    return true;
  }
}
