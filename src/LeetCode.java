import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class LeetCode {
	public static void main(String[] args) {
		_199BinaryTreeRightSideView test = new _199BinaryTreeRightSideView();
		_199BinaryTreeRightSideView.TreeNode t = test.new TreeNode(1);
		_199BinaryTreeRightSideView.TreeNode l = test.new TreeNode(2);
		_199BinaryTreeRightSideView.TreeNode lr = test.new TreeNode(5);
		_199BinaryTreeRightSideView.TreeNode lrl = test.new TreeNode(6);
		_199BinaryTreeRightSideView.TreeNode r = test.new TreeNode(3);
		_199BinaryTreeRightSideView.TreeNode rr = test.new TreeNode(4);
		t.left = l;
		l.right = lr;
		lr.left = lrl;
		t.right = r;
		r.right = rr;
//		int a = 9;
		List<Integer> result = test.rightSideView(t);
    	System.out.println(result);
	}
}