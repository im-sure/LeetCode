import java.util.List;

public class LeetCode {
	public static void main(String[] args) {
		_290WordPattern test = new _290WordPattern();
		String a = "abba";
		String b = "dog cat cat dog";
		boolean result = test.wordPattern(a, b);
		System.out.println(result);
	}
}