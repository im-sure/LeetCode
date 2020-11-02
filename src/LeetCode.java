import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class LeetCode {
	public static void main(String[] args) {
    _0098ValidateBinarySearchTree test = new _0098ValidateBinarySearchTree();
    _0098ValidateBinarySearchTree.TreeNode n1 = test.new TreeNode(5);
    _0098ValidateBinarySearchTree.TreeNode n2 = test.new TreeNode(1);
    _0098ValidateBinarySearchTree.TreeNode n3 = test.new TreeNode(4);
    _0098ValidateBinarySearchTree.TreeNode n4 = test.new TreeNode(3);
    _0098ValidateBinarySearchTree.TreeNode n5 = test.new TreeNode(6);
    n1.left = n2;
    n1.right = n3;
    n3.left = n4;
    n3.right = n5;
		System.out.println(test.isValidBST(n1));
	}
}