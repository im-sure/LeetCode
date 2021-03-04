import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class _0103BinaryTreeZigzagLevelOrderTraversal {
  public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
    List<List<Integer>> res = new ArrayList<>();
    if (root != null) {
      Stack<TreeNode> stack = new Stack<>();
      stack.push(root);
      boolean fromLeft = true;
      while (!stack.isEmpty()) {
        Stack<TreeNode> tmp = new Stack<>();
        List<Integer> vals = new ArrayList<>();
        while (!stack.isEmpty()) {
          TreeNode node = stack.pop();
          vals.add(node.val);
          if (fromLeft) {
            if (node.left != null) {
              tmp.push(node.left);
            }
            if (node.right != null) {
              tmp.push(node.right);
            }
          } else {
            if (node.right != null) {
              tmp.push(node.right);
            }
            if (node.left != null) {
              tmp.push(node.left);
            }
          }
        }
        stack = tmp;
        res.add(vals);
        fromLeft = !fromLeft;
      }
    }
    return res;
  }

  public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }
}
