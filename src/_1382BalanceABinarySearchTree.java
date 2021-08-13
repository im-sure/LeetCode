import java.util.ArrayList;
import java.util.List;

public class _1382BalanceABinarySearchTree {
  public TreeNode balanceBST(TreeNode root) {
    if (root == null) {
      return null;
    }
    List<TreeNode> nodes = LDR(root);
    root = buildTree(nodes, 0, nodes.size());
    return root;
  }

  private List<TreeNode> LDR(TreeNode node) {
    List<TreeNode> nodes = new ArrayList<>();
    if (node.left != null) {
      nodes.addAll(LDR(node.left));
    }
    nodes.add(node);
    if (node.right != null) {
      nodes.addAll(LDR(node.right));
    }
    node.left = null;
    node.right = null;
    return nodes;
  }

  private TreeNode buildTree(List<TreeNode> nodes, int start, int l) {
    if (l == 1) {
      return nodes.get(start);
    } else if (l > 1) {
      int mid = start + l / 2;
      TreeNode curRoot = nodes.get(mid);
      TreeNode left = buildTree(nodes, start, mid - start);
      curRoot.left = left;
      TreeNode right = buildTree(nodes, mid + 1, l - mid + start - 1);
      curRoot.right = right;
      return curRoot;
    }
    return null;
  }

  public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }
}
