import java.util.Iterator;
import java.util.List;

public class LeetCode {
	public static void main(String[] args) {
		_452MinimumNumberOfArrowsToBurstBalloons test = new _452MinimumNumberOfArrowsToBurstBalloons();
		int[][] a = {{1, 2}, {3, 4}, {5, 6}, {7,8}};
		int result = test.findMinArrowShots(a);
		System.out.println(result);
	}
}