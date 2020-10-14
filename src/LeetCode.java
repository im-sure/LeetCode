import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class LeetCode {
	public static void main(String[] args) {
    _0743NetworkDelayTime test = new _0743NetworkDelayTime();
    int[][] times = {{2, 1, 1}, {2, 3, 1}, {3, 4, 1}};
		System.out.println(test.networkDelayTime(times, 4, 2));
	}
}