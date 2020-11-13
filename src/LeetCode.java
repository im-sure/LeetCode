import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class LeetCode {
	public static void main(String[] args) {
    _0297SerializeAndDeserializeBinaryTree test = new _0297SerializeAndDeserializeBinaryTree();
    _0297SerializeAndDeserializeBinaryTree.TreeNode n1 = test.new TreeNode(1);
    _0297SerializeAndDeserializeBinaryTree.TreeNode n2 = test.new TreeNode(2);
    _0297SerializeAndDeserializeBinaryTree.TreeNode n3 = test.new TreeNode(3);
    _0297SerializeAndDeserializeBinaryTree.TreeNode n4 = test.new TreeNode(4);
    _0297SerializeAndDeserializeBinaryTree.TreeNode n5 = test.new TreeNode(5);
    n1.left = n2;
    n1.right = n3;
    n3.left = n4;
    n3.right = n5;
    String data = test.serialize(n1);
		System.out.println("'" + data + "'");
		System.out.println(test.deserialize(data));
	}
}