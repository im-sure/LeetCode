import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class _0139WordBreak {
  public boolean wordBreak(String s, List<String> wordDict) {
    int minWord = Integer.MAX_VALUE;
    int maxWord = Integer.MIN_VALUE;
    for (String word : wordDict) {
      minWord = Math.min(minWord, word.length());
      maxWord = Math.max(maxWord, word.length());
    }
    Set<String> wordSet = new HashSet<>(wordDict);
    int length = s.length();
    boolean[] dp = new boolean[length + 1];
    dp[0] = true;
    for (int i = minWord; i <= length; i++) {
      for (int j = Math.max(0, i - maxWord); j <= i - minWord; j++) {
        if (dp[j] && wordSet.contains(s.substring(j, i))) {
          dp[i] = true;
          break;
        }
      }
    }
    return dp[length];
  }
}
