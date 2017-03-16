import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class LeetCode {
	public static void main(String[] args) {
		_129SumRootToLeafNumbers test = new _129SumRootToLeafNumbers();
		_129SumRootToLeafNumbers.TreeNode t = test.new TreeNode(4);
		_129SumRootToLeafNumbers.TreeNode l = test.new TreeNode(9);
		_129SumRootToLeafNumbers.TreeNode r = test.new TreeNode(0);
		_129SumRootToLeafNumbers.TreeNode lr = test.new TreeNode(1);
		t.left = l;
		t.right = r;
		l.right = lr;
//		int[] a = {2,3,4,5,18,17,6};
		String a = "abcdefghijklmnopqrstuvwxyz";
		int result = test.sumNumbers(t);
		System.out.println(result);
	}
}