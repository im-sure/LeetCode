import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class LeetCode {
	public static void main(String[] args) {
		_108ConvertSortedArrayToBinarySearchTree test = new _108ConvertSortedArrayToBinarySearchTree();
		int[] a = {3,5,8};
		_108ConvertSortedArrayToBinarySearchTree.TreeNode result = test.sortedArrayToBST(a);
    	System.out.println(result.val + " " + result.left.val + " " + result.right.val);
	}
}