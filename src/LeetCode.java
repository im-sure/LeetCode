import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class LeetCode {
	public static void main(String[] args) {
		_300LongestIncreasingSubsequence test = new _300LongestIncreasingSubsequence();
		int[] a = {10, 9, 2, 5, 3, 7, 101, 18};
		int result = test.lengthOfLIS(a);
		System.out.println(result);
	}
}