import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class LeetCode {
	public static void main(String[] args) {
		_075SortColors test = new _075SortColors();
		int[] a = {1,2,2,2,2,0,0,0,1,1};
		test.sortColors(a);
		for(int n : a) System.out.println(n);
	}
}