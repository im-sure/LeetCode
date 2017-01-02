import java.util.Iterator;
import java.util.List;

public class LeetCode {
	public static void main(String[] args) {
		_436FindRightInterval test = new _436FindRightInterval();
		_436FindRightInterval.Interval a = test.new Interval(1, 2);
		_436FindRightInterval.Interval b = test.new Interval(2, 3);
		_436FindRightInterval.Interval c = test.new Interval(0, 1);
		_436FindRightInterval.Interval d = test.new Interval(3, 4);
		_436FindRightInterval.Interval[] r = {a, b, c, d};
		int[] result = test.findRightInterval(r);
		for (int i = 0; i < result.length; i++) System.out.println(result[i]);
	}
}