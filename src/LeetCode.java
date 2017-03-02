import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class LeetCode {
	public static void main(String[] args) {
		_215KthLargestElementInAnArray test = new _215KthLargestElementInAnArray();
		int[] a = {3,2,1,5,6,4};
		int result = test.findKthLargest(a, 2);
		System.out.println(result);
	}
}