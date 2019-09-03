
public class _0235LowestCommonAncestorOfABinarySearchTree {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null) return null;
    	TreeNode left = lowestCommonAncestor(root.left, p, q);
    	TreeNode right = lowestCommonAncestor(root.right, p, q);
    	if (root == p || root == q) return root;
    	else if ((left == p || left == q) && (right == p || right == q)) return root;
    	else if (left == p || left == q) return left;
    	else if (right == p || right == q) return right;
    	else return left != null ? left : right;
    }
    
	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int x) { val = x; }
	}
}
