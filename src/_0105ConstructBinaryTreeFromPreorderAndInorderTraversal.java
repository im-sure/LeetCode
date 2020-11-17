public class _0105ConstructBinaryTreeFromPreorderAndInorderTraversal {
  public TreeNode buildTree(int[] preorder, int[] inorder) {
    if (preorder == null || preorder.length == 0) {
      return null;
    }
    return buildTree(preorder, 0, inorder, 0, preorder.length);
  }

  private TreeNode buildTree(int[] preorder, int i, int[] inorder, int start, int end) {
    TreeNode node = new TreeNode(preorder[i]);
    int index = findIndex(inorder, start, end, preorder[i]);
    if (index > start) {
      node.left = buildTree(preorder, i + 1, inorder, start, index);
    }
    if (index < end - 1) {
      node.right = buildTree(preorder, i + index - start + 1, inorder, index + 1, end);
    }
    return node;
  }

  private int findIndex(int[] inorder, int start, int end, int value) {
    for (int i = start; i < end; i++) {
      if (inorder[i] == value) {
        return i;
      }
    }
    return -1;
  }
  
  public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }
}
