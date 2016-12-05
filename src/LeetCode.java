import java.util.List;

public class LeetCode {
	public static void main(String[] args) {
		_001TwoSum test = new _001TwoSum();
		int[] a = {0,3,4,0};
		int b = 0;
		int[] result = test.twoSum(a, b);
		for (int i = 0; i < result.length; i++) System.out.println(result[i]);
	}
}