import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class LeetCode {
	public static void main(String[] args) {
		_077Combinations test = new _077Combinations();
		int[] a = {4,5,6,0};
		List<List<Integer>> result = test.combine(4, 2);
		for (List<Integer> l : result) System.out.println(l);
	}
}