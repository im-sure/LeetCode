import java.util.ArrayDeque;
import java.util.Deque;

public class _0297SerializeAndDeserializeBinaryTree {
  // Encodes a tree to a single string.
  public String serialize(TreeNode root) {
    if (root == null) {
      return "";
    }
    StringBuilder sb = new StringBuilder();
    Deque<TreeNode> deque = new ArrayDeque<>();
    sb.append(root.val);
    sb.append(',');
    deque.add(root);
    while (!deque.isEmpty()) {
      TreeNode node = deque.removeFirst();
      if (node.left == null) {
        sb.append(' ');
      } else {
        sb.append(node.left.val);
        deque.add(node.left);
      }
      sb.append(',');
      if (node.right == null) {
        sb.append(' ');
      } else {
        sb.append(node.right.val);
        deque.add(node.right);
      }
      sb.append(',');
    }
    return sb.toString();
  }

  // Decodes your encoded data to tree.
  public TreeNode deserialize(String data) {
    if (data == null || data.isEmpty()) {
      return null;
    }
    TreeNode root = null;
    TreeNode node = null;
    Deque<TreeNode> deque = new ArrayDeque<>();
    boolean isLeft = true;
    String[] strs = data.split(",");
    for (int i = 0; i < strs.length; i++) {
      String str = strs[i];
      if (root == null) {
        root = new TreeNode(Integer.parseInt(str));
        deque.add(root);
      } else {
        if (node == null) {
          node = deque.removeFirst();
        }
        if (str.equals(" ")) {
          if (isLeft) {
            isLeft = false;
          } else {
            isLeft = true;
            node = null;
          }
        } else {
          TreeNode newNode = new TreeNode(Integer.parseInt(str));
          deque.add(newNode);
          if (isLeft) {
            isLeft = false;
            node.left = newNode;
          } else {
            isLeft = true;
            node.right = newNode;
            node = null;
          }
        }
      }
    }
    return root;
  }

  public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }

      @Override
      public String toString() {
        return String.format("(val: %d, l: %s, r: %s)", val, (left == null ? " " : left.toString()), (right == null ? " " : right.toString()));
      }
  }
}
