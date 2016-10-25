
public class _104MaximumDepthOfBinaryTree {
    public int maxDepth(TreeNode root) {
    	int leftDepth = 1;
    	int rightDepth = 1;
    	if (root == null) {
    		return 0;
    	}
    	if (root.left != null) {
    		leftDepth += maxDepth(root.left);
    	}
    	if (root.right != null) {
    		rightDepth += maxDepth(root.right);
    	}
    	return leftDepth > rightDepth ? leftDepth : rightDepth;
    }
    
    public class TreeNode {
    	int val;
    	TreeNode left;
    	TreeNode right;
    	public TreeNode(int x) { val = x; }
    }
}
