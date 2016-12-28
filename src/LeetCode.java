import java.util.Iterator;
import java.util.List;

public class LeetCode {
	public static void main(String[] args) {
		_094BinaryTreeInorderTraversal test = new _094BinaryTreeInorderTraversal();
		_094BinaryTreeInorderTraversal.TreeNode r = test.new TreeNode(1);
		_094BinaryTreeInorderTraversal.TreeNode r1 = test.new TreeNode(2);
		_094BinaryTreeInorderTraversal.TreeNode r2 = test.new TreeNode(3);
		r.right = r1;
		r1.left = r2;
		List<Integer> result = test.inorderTraversal(r);
		Iterator<Integer> it = result.iterator();
		while (it.hasNext()) {
			int n = it.next();
			System.out.println(n);
		}
	}
}