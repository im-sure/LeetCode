import java.util.Arrays;
import java.util.Comparator;

public class _0621TaskScheduler {
  private Comparator<int[]> com = new Comparator<int[]>(){
    @Override
    public int compare(int[] arr1, int[] arr2) {
      return arr2[0] - arr1[0];
    }
  };

  public int leastInterval(char[] tasks, int n) {
    int[][] taskNums = new int[26][1];
    for (char c : tasks) {
      taskNums[c - 'A'][0]++;
    }
    Arrays.sort(taskNums, com);
    int res = 0;
    int num = 0;
    while (taskNums[0][0] > 0) {
      if (num != 0 && num < n + 1) {
        res += n + 1 - num;
      }
      num = 0;
      for (int i = 0; i < 26; i++) {
        if (taskNums[i][0] == 0) {
          break;
        }
      }
      for (int i = 0; i < 26; i++) {
        if (taskNums[i][0] == 0) {
          break;
        }
        taskNums[i][0]--;
        res++;
        num++;
        if (num >= n + 1) {
          break;
        }
      }
      Arrays.sort(taskNums, com);
    }
    return res;
  }
}
