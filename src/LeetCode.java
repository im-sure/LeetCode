import java.util.List;

public class LeetCode {
	public static void main(String[] args) {
		_118PascalsTriangle test = new _118PascalsTriangle();
		int a = 5;
		List<List<Integer>> result = test.generate(a);
		System.out.print(result.toString());
	}
}