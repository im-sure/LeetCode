import java.util.List;

public class LeetCode {
	public static void main(String[] args) {
		_338CountingBits test = new _338CountingBits();
		int a = 5;
		int[] result = test.countBits(a);
		for (int i = 0; i < result.length; i++) System.out.println(result[i]);
	}
}