import java.util.LinkedList;
import java.util.Queue;

public class _0449SerializeAndDeserializeBST {
	public String serialize(TreeNode root) {
        if (root == null) return "n";
		Queue<TreeNode> qRoot = new LinkedList<TreeNode>();
        StringBuilder sb = new StringBuilder();
		qRoot.offer(root);
        sb.append(root.val);
        while(!qRoot.isEmpty()) {
    		Queue<TreeNode> qNode = new LinkedList<TreeNode>();
            StringBuilder sbNode = new StringBuilder();
            boolean isFirst = true;
    		while(!qRoot.isEmpty()) {
    			TreeNode node = qRoot.poll();
    			if (!isFirst) sbNode.append(',');
    			if (node.left != null) {
    				qNode.offer(node.left);
    				sbNode.append(node.left.val);
    			} else sbNode.append('n');
    			sbNode.append(',');
    			if (node.right != null) {
    				qNode.offer(node.right);
    				sbNode.append(node.right.val);
    			} else sbNode.append('n');
    			isFirst = false;;
    		}
    		if (!qNode.isEmpty()) {
    			sbNode.insert(0, ';');
    			sb.append(sbNode);
    		}
    		qRoot = qNode;
        }
        return sb.toString();
    }

    public TreeNode deserialize(String data) {
    	TreeNode root;
    	String[] sLevel = data.split(";");
    	if (sLevel[0].equals("n")) return null;
    	else root = new TreeNode(Integer.valueOf(sLevel[0]));
		Queue<TreeNode> qRoot = new LinkedList<TreeNode>();
    	qRoot.offer(root);
    	for (int i = 1; i < sLevel.length; i++) {
    		String[] sNode = sLevel[i].split(",");
    		Queue<TreeNode> qNode = new LinkedList<TreeNode>();
    		for (int j = 0; j < sNode.length; j++) {
    			TreeNode node = qRoot.poll();
    			String s = sNode[j];
    			if (!s.equals("n")) {
    				node.left = new TreeNode(Integer.valueOf(s));
    				qNode.offer(node.left);
    			}
    			s = sNode[++j];
    			if (!s.equals("n")) {
    				node.right = new TreeNode(Integer.valueOf(s));
    				qNode.offer(node.right);
    			}
    		}
    		qRoot = qNode;
    	}
    	return root;
    }
    
	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int x) { val = x; }
	}
}
