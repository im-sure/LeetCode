import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class LeetCode {
	public static void main(String[] args) {
		_078Subsets test = new _078Subsets();
		int[] a = {1, 2, 3};
		List<List<Integer>> result = test.subsets(a);
		for (List<Integer> l : result) System.out.println(l);
	}
}