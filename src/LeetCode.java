import java.util.Iterator;
import java.util.List;

public class LeetCode {
	public static void main(String[] args) {
		_230KthSmallestElementInABST test = new _230KthSmallestElementInABST();
		_230KthSmallestElementInABST.TreeNode t = test.new TreeNode(0);
		_230KthSmallestElementInABST.TreeNode l = test.new TreeNode(-1);
		_230KthSmallestElementInABST.TreeNode r = test.new TreeNode(2);
		_230KthSmallestElementInABST.TreeNode rl = test.new TreeNode(1);
		_230KthSmallestElementInABST.TreeNode rr = test.new TreeNode(3);
		t.left = l;
		t.right = r;
		r.left = rl;
		r.right = rr;
		int result = test.kthSmallest(t, 4);
		System.out.println(result);
	}
}