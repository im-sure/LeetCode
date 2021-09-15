public class _0057InsertInterval {
  public int[][] insert(int[][] intervals, int[] newInterval) {
    int index = 0;
    int cover = 0;
    for (int i = 0; i < intervals.length; i++) {
      int[] interval = intervals[i];
      if (newInterval[0] > interval[1]) {
        index = i + 1;
      } else if (newInterval[1] < interval[0]) {
        break;
      } else {
        cover++;
        newInterval[0] = Math.min(newInterval[0], interval[0]);
        newInterval[1] = Math.max(newInterval[1], interval[1]);
      }
    }
    int[][] newIntervals = new int[intervals.length + 1 - cover][2];
    for (int i = 0; i < newIntervals.length; i++) {
      if (i < index) {
        newIntervals[i] = intervals[i];
      } else if (i == index) {
        newIntervals[i] = newInterval;
      } else {
        newIntervals[i] = intervals[i - 1 + cover];
      }
    }
    return newIntervals;
  }
}
