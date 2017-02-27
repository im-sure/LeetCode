import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class LeetCode {
	public static void main(String[] args) {
		_491IncreasingSubsequences test = new _491IncreasingSubsequences();
		int[] a = {4, 6, 7, 7};
		List<List<Integer>> result = test.findSubsequences(a);
    	System.out.println(result);
	}
}