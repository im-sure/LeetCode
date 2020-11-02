public class _0538ConvertBSTToGreaterTree {
  public TreeNode convertBST(TreeNode root) {
    if (root != null) {
      sum(root, 0);
    }
    return root;
  }

  private int sum(TreeNode node, int parentValue) {
    int midValue = node.val + parentValue;
    if (node.right != null) {
      int value = sum(node.right, parentValue);
      midValue = node.val + value;
    }
    node.val = midValue;
    int maxValue = node.val;
    if (node.left != null) {
      maxValue = sum(node.left, node.val);
    }
    return maxValue;
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
