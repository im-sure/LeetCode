import java.util.List;

public class LeetCode {
	public static void main(String[] args){
		_235LowestCommonAncestorOfABinarySearchTree test = new _235LowestCommonAncestorOfABinarySearchTree();
		_235LowestCommonAncestorOfABinarySearchTree.TreeNode one = test.new TreeNode(1);
		_235LowestCommonAncestorOfABinarySearchTree.TreeNode two = test.new TreeNode(2);
		_235LowestCommonAncestorOfABinarySearchTree.TreeNode three = test.new TreeNode(3);
		_235LowestCommonAncestorOfABinarySearchTree.TreeNode four = test.new TreeNode(4);
		_235LowestCommonAncestorOfABinarySearchTree.TreeNode five = test.new TreeNode(5);
		_235LowestCommonAncestorOfABinarySearchTree.TreeNode six = test.new TreeNode(6);
		_235LowestCommonAncestorOfABinarySearchTree.TreeNode seven = test.new TreeNode(7);
		one.left = two;
		one.right = three;
		two.left = four;
		two.right = five;
		three.left = six;
		three.right = seven;
		_235LowestCommonAncestorOfABinarySearchTree.TreeNode result = test.lowestCommonAncestor(one, two, seven);
		System.out.println(result.val);
	}
}