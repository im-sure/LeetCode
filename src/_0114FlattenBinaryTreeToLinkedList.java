public class _0114FlattenBinaryTreeToLinkedList {
  public void flatten(TreeNode root) {
    if (root != null) {
      merge(root);
    }
  }

  private TreeNode merge(TreeNode node) {
    TreeNode left = node.left;
    TreeNode right = node.right;
    node.left = null;
    if (left != null) {
      node.right = left;
      node = merge(left);
    }
    if (right != null) {
      node.right = right;
      node = merge(right);
    }
    return node;
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
