import java.util.Stack;

public class _0222CountCompleteTreeNodes {
  public int countNodes(TreeNode root) {
    if (root == null) {
      return 0;
    }
    TreeNode node = root;
    Stack<TreeNode> path = new Stack<>();
    while (node.left != null) {
      path.add(node);
      node = node.left;
    }
    int level = path.size();
    int count = 1;
    while (node != null && !path.isEmpty()) {
      while (!path.isEmpty() && node == path.peek().right) {
        node = path.pop();
      }
      if (path.isEmpty()) {
        break;
      }
      node = path.peek().right;
      while (path.size() < level) {
        path.add(node);
        node = node.left;
      }
      if (node != null) {
        count++;
      }
    }
    return (int) Math.pow(2, level) - 1 + count;
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
