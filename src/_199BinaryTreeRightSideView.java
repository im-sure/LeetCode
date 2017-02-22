import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class _199BinaryTreeRightSideView {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> list = new ArrayList<Integer>();
        if (root != null) {
            Queue<TreeNode> queue = new LinkedList<TreeNode>();
	        queue.offer(root);
	        while (!queue.isEmpty()) {
	            Queue<TreeNode> tmp = new LinkedList<TreeNode>();
	        	list.add(queue.peek().val);
	        	while (!queue.isEmpty()) {
	        		TreeNode tn = queue.poll();
	        		if (tn.right != null) tmp.offer(tn.right);
	        		if (tn.left != null) tmp.offer(tn.left);
	        	}
	        	queue = tmp;
	        }
        }
        return list;
    }
    
	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int x) { val = x; }
	}
}
