
public class _337HouseRobberIII {
    public int rob(TreeNode root) {
        return findMax(root)[0];
    }
    
    private int[] findMax(TreeNode root) {
    	int[] max = new int[2];
    	if (root == null) return max;
    	int[] l = findMax(root.left);
    	int[] r = findMax(root.right);
    	max[1] = l[0] + r[0];
    	max[0] = Math.max(max[1], l[1] + r[1] + root.val);
    	return max;
    }
    
	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int x) { val = x; }
	}
}
