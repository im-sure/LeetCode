import java.util.List;

public class LeetCode {
	public static void main(String[] args) {
		int[] a = {1,2,3};
		_384ShuffleAnArray test = new _384ShuffleAnArray(a);
		int[] result = test.shuffle();
		for (int i = 0; i < result.length; i++) System.out.println(result[i]);
	}
}