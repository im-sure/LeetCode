import java.util.Iterator;
import java.util.List;

public class LeetCode {
	public static void main(String[] args) {
		_449SerializeAndDeserializeBST test = new _449SerializeAndDeserializeBST();
		_449SerializeAndDeserializeBST.TreeNode r = test.new TreeNode(1);
		_449SerializeAndDeserializeBST.TreeNode rl = test.new TreeNode(2);
		_449SerializeAndDeserializeBST.TreeNode rr = test.new TreeNode(3);
		_449SerializeAndDeserializeBST.TreeNode rrl = test.new TreeNode(4);
		r.left = rl;
		r.right = rr;
		rr.left = rrl;
		String result = test.serialize(r);
		_449SerializeAndDeserializeBST.TreeNode n = test.deserialize(result);
		System.out.println(n.val + " " + n.left.val + " " + n.right.val + " " + n.right.left.val);
	}
}