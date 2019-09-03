
public class _0404SumOfLeftLeaves {
	public int sumOfLeftLeaves(TreeNode root) {
        if (root == null) return 0;
        int value = 0;
        if (root.left != null) {
        	if (root.left.left == null && root.left.right == null) value += root.left.val;
        	else value += sumOfLeftLeaves(root.left);
        }
        if(root.right != null) value += sumOfLeftLeaves(root.right);
        return value;
    }
	
	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int x) { val = x; }
	}
}
