public class _0098ValidateBinarySearchTree {
  private static boolean isValid = true;

  public boolean isValidBST(TreeNode root) {
    if (root != null) {
      midOrderTraverse(root, false, 0);
    }
    return isValid;
  }

  public int midOrderTraverse(TreeNode root, boolean start, int lastValue) {
    int value = root.val;
    if (root.left != null) {
      int leftValue = midOrderTraverse(root.left, start, lastValue);
      if ((start && leftValue <= lastValue) || leftValue >= value) {
        isValid = false;
      }
    } else if (start && value <= lastValue) {
      isValid = false;
    }
    if (root.right != null) {
      value = midOrderTraverse(root.right, true, root.val);
    }
    return value;
  }

  public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }
}
