import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class LeetCode {
	public static void main(String[] args) {
		_046Permutations test = new _046Permutations();
		int[] a = {1,2,3};
		List<List<Integer>> result = test.permute(a);
    	System.out.println(result);
	}
}