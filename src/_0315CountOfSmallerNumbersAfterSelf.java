import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class _0315CountOfSmallerNumbersAfterSelf {
  public List<Integer> countSmaller(int[] nums) {
    List<Integer> res = new ArrayList<>();
    TreeNode node = new TreeNode(nums[nums.length - 1]);
    for (int i = nums.length - 1; i >= 0; i--) {
      insert(node, nums[i], res);
    }
    Collections.reverse(res);
    return res;
  }

  private void insert(TreeNode node, int num, List<Integer> res) {
    int count = 0;
    while (num != node.val) {
      if (num > node.val) {
        count += node.count + node.leftCount;
        if (node.right == null) {
          node.right = new TreeNode(num);
        }
        node = node.right;
      } else {
        node.leftCount++;
        if (node.left == null) {
          node.left = new TreeNode(num);
        }
        node = node.left;
      }
    }
    node.count++;
    count += node.leftCount;
    res.add(count);
  }

  class TreeNode {
    private int val;
    private int count;
    private int leftCount;
    private TreeNode left;
    private TreeNode right;

    TreeNode(int val) {
      this.val = val;
    }
  }
}
