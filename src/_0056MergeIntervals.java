import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class _0056MergeIntervals {
  public int[][] merge(int[][] intervals) {
    if (intervals.length <= 1) {
      return intervals;
    }
    Arrays.sort(intervals, new Comparator<int[]>(){
      @Override
      public int compare(int[] arr1, int[] arr2) {
        return arr1[0] - arr2[0];
      }
    });
    List<int[]> resList = new ArrayList<>();
    int[] tmp = null;
    for (int i = 0; i < intervals.length; i++) {
      int[] interval = intervals[i];
      if (tmp == null) {
        tmp = interval;
      } else if (interval[0] <= tmp[1]) {
        if (interval[1] > tmp[1]) {
          tmp[1] = interval[1];
        }
      } else {
        resList.add(tmp);
        tmp = interval;
      }
      if (i == intervals.length - 1) {
        resList.add(tmp);
      }
    }
    int[][] res = new int[resList.size()][2];
    for (int i = 0; i < resList.size(); i++) {
      int[] interval = resList.get(i);
      res[i] = interval;
    }
    return res;
  }
}
