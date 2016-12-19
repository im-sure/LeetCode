import java.util.List;

public class LeetCode {
	public static void main(String[] args) {
		_238ProductOfArrayExceptSelf test = new _238ProductOfArrayExceptSelf();
		int[] a = {1,2, 3, 4};
		int[] result = test.productExceptSelf(a);
		for (int i = 0; i < result.length; i++) System.out.println(result[i]);
	}
}