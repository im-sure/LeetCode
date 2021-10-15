public class _0099RecoverBinarySearchTree {
  private TreeNode n1, n2;

  public void recoverTree(TreeNode root) {
    inOrder(null, root);
    int val = n1.val;
    n1.val = n2.val;
    n2.val = val;
  }

  private TreeNode inOrder(TreeNode parent, TreeNode root) {
    if (root == null) {
      return null;
    }
    TreeNode lastNode = inOrder(parent, root.left);
    lastNode = lastNode == null ? parent : lastNode;
    if (lastNode != null && lastNode.val > root.val) {
      if (n1 == null) {
        n1 = lastNode;
      }
      n2 = root;
    }
    TreeNode finalNode = inOrder(root, root.right);
    finalNode = finalNode == null ? root : finalNode;
    return finalNode;
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
