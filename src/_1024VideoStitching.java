import java.util.Arrays;
import java.util.Comparator;

public class _1024VideoStitching {
  public int videoStitching(int[][] clips, int T) {
    if (T == 0) {
      return 0;
    }
    Arrays.sort(clips, new Comparator<int[]>(){
      @Override
      public int compare(int[] clip1, int[] clip2) {
        if (clip1[0] < clip2[0]) {
          return -1;
        } else if (clip1[0] > clip2[0]) {
          return 1;
        } else {
          if (clip1[1] < clip2[1]) {
            return -1;
          } else if (clip1[1] > clip2[1]) {
            return 1;
          }
        }
        return 0;
      }
    });
    int[] dp = new int[T + 1];
    for (int[] clip : clips) {
      if (clip[0] > T) {
        break;
      }
      if (clip[0] > 0 && dp[clip[0]] == 0) {
        break;
      }
      int base = clip[0] == 0 ? 0 : dp[clip[0]];
      for (int index = clip[0] + 1; index <= clip[1]; index++) {
        if (index > T) {
          break;
        }
        dp[index] = dp[index] == 0 ? base + 1 : Math.min(dp[index], base + 1);
      }
    } 
    return dp[T] > 0 ? dp[T] : -1;
  }
}
