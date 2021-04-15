import java.util.ArrayList;
import java.util.List;

public class _0623AddOneRowToTree {
  public TreeNode addOneRow(TreeNode root, int val, int depth) {
    if (depth == 1) {
      TreeNode node = new TreeNode(val, root, null);
      return node;
    }
    List<TreeNode> nodes = new ArrayList<>();
    nodes.add(root);
    int d = 1;
    while (d < depth - 1) {
      List<TreeNode> newNodes = new ArrayList<>();
      for (TreeNode node : nodes) {
        if (node.left != null) {
          newNodes.add(node.left);
        }
        if (node.right != null) {
          newNodes.add(node.right);
        }
      }
      nodes = newNodes;
      d++;
    }
    for (TreeNode node : nodes) {
      node.left = new TreeNode(val, node.left, null);
      node.right = new TreeNode(val, null, node.right);
    }
    return root;
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
