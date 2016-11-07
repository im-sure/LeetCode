import java.util.HashMap;
import java.util.Map;

public class _437PathSumIII {
    public int pathSum(TreeNode root, int sum) {
    	if (root == null) return 0;
    	int pathSum = 0;
    	Map<TreeNode, Integer> map = new HashMap<TreeNode, Integer>();
    	Map<TreeNode, Integer> mapAdd = new HashMap<TreeNode, Integer>();
        if (root.val == sum) pathSum++;
        if (root.left != null) map.put(root.left, root.val + root.left.val);
        if (root.right != null) map.put(root.right, root.val + root.right.val);
        while (!map.isEmpty()){
        	for (TreeNode key : map.keySet()) {
        		int v = map.get(key);
        		if (v == sum) pathSum++;
	    		if (key.left != null) mapAdd.put(key.left, v + key.left.val);
	    		if (key.right != null) mapAdd.put(key.right, v + key.right.val);
        	}
        	map.clear();
        	for (TreeNode key : mapAdd.keySet()) {
        		int v = mapAdd.get(key);
        		map.put(key, v);
        	}
        	mapAdd.clear();
        }
        pathSum += pathSum(root.left, sum);
        pathSum += pathSum(root.right, sum);
        return pathSum;
    }
    
	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int x) { val = x; }
	}
}
