public class _0072EditDistance {
  public int minDistance(String word1, String word2) {
    int length1 = word1.length();
    int length2 = word2.length();
    int[][] dis = new int[length1 + 1][length2 + 1];
    for (int i = 0; i <= length1; i++) {
      dis[i][0] = i;
    }
    for (int j = 0; j <= length2; j++) {
      dis[0][j] = j;
    }
    for (int i = 1; i <= length1; i++) {
      for (int j = 1; j <= length2; j++) {
        if (word1.charAt(i - 1) == word2.charAt(j - 1)) {
          dis[i][j] = dis[i - 1][j - 1];
        } else {
          dis[i][j] = 1 + Math.min(dis[i - 1][j - 1], Math.min(dis[i - 1][j], dis[i][j - 1]));
        }
      }
    }
    return dis[length1][length2];
  }
}
