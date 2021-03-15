import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class LeetCode {
	public static void main(String[] args) {
    _0222CountCompleteTreeNodes test = new _0222CountCompleteTreeNodes();
    _0222CountCompleteTreeNodes.TreeNode n1 = test.new TreeNode();
    _0222CountCompleteTreeNodes.TreeNode n2 = test.new TreeNode();
    _0222CountCompleteTreeNodes.TreeNode n3 = test.new TreeNode();
    n1.left = n2;
    n1.right = n3;
    System.out.println(test.countNodes(n1));
  }
}