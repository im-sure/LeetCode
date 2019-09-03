
public class _0226InvertBinaryTree {
	public TreeNode invertTree(TreeNode root) {
        if (root == null) return null;
        if (root.left != null) invertTree(root.left);
        if (root.right != null) invertTree(root.right);
        TreeNode tmp;
        tmp = root.left;
        root.left = root.right;
        root.right = tmp;
        return root;
    }

	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int x) { val = x; }
	}
}
