public class _0124BinaryTreeMaximumPathSum {
  private int max = Integer.MIN_VALUE;

  public int maxPathSum(TreeNode root) {
    maxSide(root);
    return max;
  }

  public int maxSide(TreeNode root) {
    if (root == null) {
      return 0;
    }
    int left = maxSide(root.left);
    int right = maxSide(root.right);
    int current = left + root.val + right;
    max = Math.max(max, current);
    int res = Math.max(0, Math.max(root.val + left, root.val + right));
    return res;
  }

  public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }
}
