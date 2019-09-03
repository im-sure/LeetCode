import java.util.Stack;

public class _0129SumRootToLeafNumbers {
    public int sumNumbers(TreeNode root) {
    	if (root == null) return 0;
        return sumNumbers(root, 0);
    }
    
    private int sumNumbers(TreeNode root, int sum) {
    	Stack<TreeNode> stack = new Stack<TreeNode>();
    	stack.push(root);
    	int tmpSum = sum * 10 + root.val;
    	int s = 0;
    	while (root.left != null) {
    		stack.push(root.left);
    		root = root.left;
    		tmpSum = tmpSum * 10 + root.val;
    	}
    	if (root.right == null) s = tmpSum;
    	while (!stack.isEmpty()) {
    		if (stack.peek().right != null) {
    			int a = sumNumbers(stack.peek().right, tmpSum);
    			s += a;
    		}
			tmpSum /= 10;
			stack.pop();
    	}
    	return s;
    }
    
	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int x) { val = x; }
	}
}
