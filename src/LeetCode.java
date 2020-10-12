import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class LeetCode {
	public static void main(String[] args) {
    _0524LongestWordInDictionaryThroughDeleting test = new _0524LongestWordInDictionaryThroughDeleting();
    String s = "foobarfoobar";
    List<String> d = Arrays.asList("foo","bar");
		System.out.println(test.findLongestWord(s, d));
	}
}