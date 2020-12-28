import java.util.Stack;

public class _0236LowestCommonAncestorOfABinaryTree {
  TreeNode res = null;

  public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
    find(root, p, q);
    return res;
  }

  private int find(TreeNode node, TreeNode p, TreeNode q) {
    int num = 0;
    if (node.val == p.val || node.val == q.val) {
      num++;
    }
    if (node.left != null) {
      num += find(node.left, p, q);
      if (num == 2 && res == null) {
        res = node;
        return num;
      }
    }
    if (num != 2 && node.right != null) {
      num += find(node.right, p, q);
      if (num == 2 && res == null) {
        res = node;
        return num;
      }
    }
    return num;
  }

  public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }
}
