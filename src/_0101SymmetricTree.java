
public class _0101SymmetricTree {
    public boolean isSymmetric(TreeNode root) {
    	if (root == null) return true;
    	else return values(root.left, true).equals(values(root.right, false));
    }
    
    public String values(TreeNode root, boolean fromLeft) {
    	if (root == null) return "";
    	String v = "" + root.val;
    	if (fromLeft) {
    		if (root.left != null) v += values(root.left, true);
    		else v += "a";
    		if (root.right != null) v += values(root.right, true);
    		else v += "a";
    	} else {
    		if (root.right != null) v += values(root.right, false);
    		else v += "a";
    		if (root.left != null) v += values(root.left, false);
    		else v += "a";
    	}
    	return v;
    }
    
	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int x) { val = x; }
	}
}
