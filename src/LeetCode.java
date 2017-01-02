import java.util.Iterator;
import java.util.List;

public class LeetCode {
	public static void main(String[] args) {
		_318MaximumProductOfWordLengths test = new _318MaximumProductOfWordLengths();
		String[] a = {"abcw", "baz", "foo", "bar", "xtfn", "abcdef"};
		int result = test.maxProduct(a);
		System.out.println(result);
	}
}