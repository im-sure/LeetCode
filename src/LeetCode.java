import java.util.List;

public class LeetCode {
	public static void main(String[] args){
		_101SymmetricTree test = new _101SymmetricTree();
		_101SymmetricTree.TreeNode one = test.new TreeNode(1);
		_101SymmetricTree.TreeNode two1 = test.new TreeNode(2);
		_101SymmetricTree.TreeNode two2 = test.new TreeNode(2);
		_101SymmetricTree.TreeNode three1 = test.new TreeNode(3);
		_101SymmetricTree.TreeNode four1 = test.new TreeNode(4);
		_101SymmetricTree.TreeNode three2 = test.new TreeNode(3);
		_101SymmetricTree.TreeNode four2 = test.new TreeNode(4);
		_101SymmetricTree.TreeNode five1 = test.new TreeNode(5);
		_101SymmetricTree.TreeNode five2 = test.new TreeNode(5);
		_101SymmetricTree.TreeNode six1 = test.new TreeNode(6);
		_101SymmetricTree.TreeNode six2 = test.new TreeNode(6);
		one.left = two1;
		one.right = two2;
		two1.left = three1;
		two1.right = four1;
		two2.left = four2;
		two2.right = three2;
		four1.left = five1;
		four1.right = six1;
		four2.left = six2;
		four2.right = five2;
		boolean result = test.isSymmetric(one);
		System.out.println(result);
	}
}