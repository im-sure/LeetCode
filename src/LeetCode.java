import java.util.List;

public class LeetCode {
	public static void main(String[] args){
		_107BinaryTreeLevelOrderTraversalII test = new _107BinaryTreeLevelOrderTraversalII();
		_107BinaryTreeLevelOrderTraversalII.TreeNode one = test.new TreeNode(1);
		_107BinaryTreeLevelOrderTraversalII.TreeNode two = test.new TreeNode(2);
		_107BinaryTreeLevelOrderTraversalII.TreeNode three = test.new TreeNode(3);
		_107BinaryTreeLevelOrderTraversalII.TreeNode four = test.new TreeNode(4);
		_107BinaryTreeLevelOrderTraversalII.TreeNode five = test.new TreeNode(5);
		_107BinaryTreeLevelOrderTraversalII.TreeNode six = test.new TreeNode(6);
		_107BinaryTreeLevelOrderTraversalII.TreeNode seven = test.new TreeNode(7);
		one.left = two;
		one.right = three;
		two.left = four;
		two.right = five;
		three.left = six;
		three.right = seven;
		List<List<Integer>> result = test.levelOrderBottom(one);
		System.out.println(result.toString());
	}
}