public class _0978LongestTurbulentSubarray {
  public int maxTurbulenceSize(int[] arr) {
    int max = 0;
    int tmp = 0;
    int sig = 0;
    for (int i = 0; i < arr.length; i++) {
      if (i > 0) {
        int diff = arr[i] - arr[i - 1];
        sig *= diff;
        if (sig > 0) {
          tmp = 1;
        }
        if (diff == 0) {
          tmp = 0;
        } else {
          sig = diff > 0 ? 1 : -1;
        }
      }
      tmp++;
      max = Math.max(max, tmp);
    }
    return max;
  }
}
