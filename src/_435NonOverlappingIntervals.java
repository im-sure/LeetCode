import java.util.Arrays;
import java.util.Comparator;

public class _435NonOverlappingIntervals {
    public int eraseOverlapIntervals(Interval[] intervals) {
    	if (intervals.length == 0)  return 0;
        Arrays.sort(intervals, new Comparator<Interval>() {
        	public int compare(Interval a, Interval b) {
                return a.end - b.end;
            }
        });
        int end = intervals[0].end;
        int count = 0;
        for (int i = 1; i < intervals.length; i++) {
        	if (intervals[i].start >= end) end = intervals[i].end;
        	else count++;
        }
        return count;
    }
    
    public class Interval {
    	int start;
    	int end;
    	Interval() { start = 0; end = 0; }
    	Interval(int s, int e) { start = s; end = e; }
    }
}
