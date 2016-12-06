import java.util.List;

public class LeetCode {
	public static void main(String[] args) {
		int[] a = {-2, 0, 3, -5, 2, -1};
		_303RangeSumQuery_Immutable test = new _303RangeSumQuery_Immutable(a);
		int result = test.sumRange(0, 5);
		System.out.println(result);
	}
}