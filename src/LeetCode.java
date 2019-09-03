import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class LeetCode {
	public static void main(String[] args) {
		_0388LongestAbsoluteFilePath test = new _0388LongestAbsoluteFilePath();
		String a = "dir\n\tsubdir1\n\t\tfile1.ext\n\t\tsubsubdir1\n\tsubdir2\n\t\tsubsubdir2\n\t\t\tfile2.ext";
		int result = test.lengthLongestPath(a);
		System.out.println(result);
	}
}