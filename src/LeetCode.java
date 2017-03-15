import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class LeetCode {
	public static void main(String[] args) {
		_395LongestSubstringWithAtLeastKRepeatingCharacters test = new _395LongestSubstringWithAtLeastKRepeatingCharacters();
//		int[] a = {2,3,4,5,18,17,6};
		String a = "abcdefghijklmnopqrstuvwxyz";
		int result = test.longestSubstring(a, 2);
		System.out.println(result);
	}
}