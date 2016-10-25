import java.util.List;

public class LeetCode {
	public static void main(String[] args){
		_104MaximumDepthOfBinaryTree test = new _104MaximumDepthOfBinaryTree();
		_104MaximumDepthOfBinaryTree.TreeNode tree = test.new TreeNode(1);
		tree.left = test.new TreeNode(2);
		tree.right = test.new TreeNode(3);
		tree.right.right = test.new TreeNode(4);
		int result = test.maxDepth(tree);
		System.out.println(result);
	}
}
