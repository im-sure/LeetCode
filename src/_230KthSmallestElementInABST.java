import java.util.Stack;

public class _230KthSmallestElementInABST {
    public int kthSmallest(TreeNode root, int k) {
    	Stack<TreeNode> stack = new Stack<TreeNode>();
    	while (root != null) {
    		stack.push(root);
    		root = root.left;
    	}
    	while (k != 0) {
    		TreeNode n = stack.pop();
    		if (--k == 0) return n.val;
    		n = n.right;
    		while (n != null) {
    			stack.push(n);
    			n = n.left;
    		}
    	}
    	return Integer.MIN_VALUE;
    }
    
	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int x) { val = x; }
	}
}
