import java.util.List;

public class LeetCode {
	public static void main(String[] args) {
		_219ContainsDuplicateII test = new _219ContainsDuplicateII();
		int[] a = {1,2,3,1,4,1};
		int b = 2;
		boolean result = test.containsNearbyDuplicate(a, b);
		System.out.println(result);
	}
}