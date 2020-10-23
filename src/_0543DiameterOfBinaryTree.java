public class _0543DiameterOfBinaryTree {
  int max;

  public int diameterOfBinaryTree(TreeNode root) {
    if (root == null) {
      return 0;
    }
    maxDiameter(root);
    return max;
  }

  private int maxDiameter(TreeNode node) {
    int left = node.left == null ? 0 : maxDiameter(node.left) + 1;
    int right = node.right == null ? 0 : maxDiameter(node.right) + 1;
    max = Math.max(max, left + right);
    return Math.max(left, right);
  }

  public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }
}
