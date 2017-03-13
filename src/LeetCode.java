import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class LeetCode {
	public static void main(String[] args) {
		_039CombinationSum test = new _039CombinationSum();
		int[] a = {2, 3, 6, 7};
		List<List<Integer>> list = test.combinationSum(a, 7);
		for (List<Integer> n : list) System.out.println(n);
	}
}