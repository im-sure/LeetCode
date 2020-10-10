import java.util.ArrayList;
import java.util.List;

public class _0095UniqueBinarySearchTreesII {
  public List<TreeNode> generateTrees(int n) {
    List<TreeNode> Trees = new ArrayList<>();
    for (int i = 1; i <= n; i++) {
      Trees.addAll(generateSubTree(i, 1, n));
    }
    return Trees;
  }

  private List<TreeNode> generateSubTree(int mid, int start, int end) {
    List<TreeNode> subTrees = new ArrayList<>();
    for (int i = start; i < mid; i++) {
      TreeNode node = new TreeNode(mid);
      List<TreeNode> trees = mergeTrees(node, generateSubTree(i, start, mid - 1), null);
      subTrees.addAll(trees);
    }
    if (subTrees.isEmpty() && mid > 0) {
      subTrees.add(new TreeNode(mid));
    }
    List<TreeNode> completeSubTrees = new ArrayList<>();
    for (int i = mid + 1; i <= end; i++) {
      for (TreeNode tree : subTrees) {
        TreeNode newTree = cloneTree(tree);
        List<TreeNode> trees = mergeTrees(newTree, null, generateSubTree(i, mid + 1, end));
        completeSubTrees.addAll(trees);
      }
    }
    subTrees = completeSubTrees.isEmpty() ? subTrees : completeSubTrees;
    return subTrees;
  }

  private List<TreeNode> mergeTrees(TreeNode node, List<TreeNode> leftTrees, List<TreeNode> rightTrees) {
    List<TreeNode> trees = new ArrayList<>();
    if (leftTrees != null) {
      for (TreeNode leftTree : leftTrees) {
        TreeNode newNode = new TreeNode(node.val);
        newNode.left = leftTree;
        trees.add(newNode);
      }
    }
    if (trees.isEmpty()) {
      trees.add(node);
    }
    List<TreeNode> completeTrees = new ArrayList<>();
    if (rightTrees != null) {
      for (TreeNode rightTree : rightTrees) {
        for (TreeNode tree : trees) {
          TreeNode newNode = cloneTree(tree);
          newNode.right = rightTree;
          completeTrees.add(newNode);
        }
      }
    }
    trees = completeTrees.isEmpty() ? trees : completeTrees;
    return trees;
  }

  private TreeNode cloneTree(TreeNode node) {
    if (node == null) {
      return null;
    }
    TreeNode left = cloneTree(node.left);
    TreeNode right = cloneTree(node.right);
    return new TreeNode(node.val, left, right);
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
