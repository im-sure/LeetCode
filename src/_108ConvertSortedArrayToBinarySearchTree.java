
public class _108ConvertSortedArrayToBinarySearchTree {
    public TreeNode sortedArrayToBST(int[] nums) {
        int l = nums.length;
        if (l == 0) return null;
        int mid = l / 2;
        TreeNode root = new TreeNode(nums[mid]);
        int[] lNums = new int[mid];
        int[] rNums = new int[l - mid - 1];
        for (int i = 0; i < lNums.length; i++) lNums[i] = nums[i];
        for (int i = mid + 1; i < l; i++) rNums[i - mid - 1] = nums[i];
        root.left = sortedArrayToBST(lNums);
        root.right = sortedArrayToBST(rNums);
        return root;
    }
	
	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int x) { val = x; }
	}
}
