
public class _110BalancedBinaryTree {
    public boolean isBalanced(TreeNode root) {
        int height = treeHeight(root);
        return height == -1 ? false : true;
    }
    
    public int treeHeight(TreeNode root) {
    	if (root == null) return 0;
    	int leftHeight = treeHeight(root.left);
    	int rightHeight  = treeHeight(root.right);
    	if (leftHeight!= -1 && rightHeight != -1 && Math.abs(leftHeight - rightHeight) <= 1)
    		return Math.max(leftHeight, rightHeight) + 1;
    	else return -1;
    }
	
	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int x) { val = x; }
	}
}
