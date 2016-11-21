import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class _257BinaryTreePaths {
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> list = new ArrayList<String>();
        Map<TreeNode, String> map = new HashMap<TreeNode, String>();
        if (root != null)  map.put(root, String.valueOf(root.val));
        while (!map.isEmpty()) {
            Map<TreeNode, String> newMap = new HashMap<TreeNode, String>();
        	for (TreeNode key : map.keySet()) {
        		String path = map.get(key);
        		if (key.left == null && key.right == null) list.add(path);
        		else {
	        		if (key.left != null) newMap.put(key.left, path + "->" + key.left.val);
	        		if (key.right != null) newMap.put(key.right, path + "->" + key.right.val);
        		}
        	}
        	map = newMap;
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
