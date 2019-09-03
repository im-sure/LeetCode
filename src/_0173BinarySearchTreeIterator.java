import java.util.Stack;

public class _0173BinarySearchTreeIterator {
	TreeNode root;
	Stack<TreeNode> stack = new Stack<TreeNode>();

    public _0173BinarySearchTreeIterator(TreeNode root) {
        this.root = root;
        TreeNode tn = root;
        while (tn != null) {
        	stack.push(tn);
        	tn = tn.left;
        }
    }

    public boolean hasNext() {
        return !stack.isEmpty();
    }

    public int next() {
    	TreeNode tn = stack.pop();
    	int val = tn.val;
        if (tn.right != null) {
        	tn = tn.right;
        	while (tn != null) {
            	stack.push(tn);
            	tn = tn.left;
            }
        }
        return val;
    }
    
    public class TreeNode {
    	int val;
    	TreeNode left;
    	TreeNode right;
    	TreeNode(int x) { val = x; }
    }
}
