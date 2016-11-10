import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Stack;

public class _107BinaryTreeLevelOrderTraversalII {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
    	Stack<List<Integer>> stack = new Stack<List<Integer>>();
    	List<List<Integer>> list = new ArrayList<List<Integer>>();
    	List<TreeNode> level = new ArrayList<TreeNode>();
    	List<Integer> value = new ArrayList<Integer>();
    	if (root != null) {
    		level.add(root);
	    	value.add(root.val);
    	}
    	while (!level.isEmpty()) {
    		stack.push(value);
    		List<TreeNode> newLevel = new ArrayList<TreeNode>();
        	List<Integer> newValue = new ArrayList<Integer>();
    		Iterator<TreeNode> it = level.iterator();
    		while (it.hasNext()) {
    			TreeNode node = it.next();
    			if (node.left != null) {
        			newLevel.add(node.left);
        			newValue.add(node.left.val);
    			}
    			if (node.right != null) {
	    			newLevel.add(node.right);
	    			newValue.add(node.right.val);
    			}
    		}
    		level = newLevel;
    		value = newValue;
    	}
    	while (!stack.isEmpty()) list.add(stack.pop());
    	return list;
    }
    
	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int x) { val = x; }
	}
}
