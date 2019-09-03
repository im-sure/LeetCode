import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class LeetCode {
	public static void main(String[] args) {
		_0133CloneGraph test = new _0133CloneGraph();
		_0133CloneGraph.Node n1 = test.new Node();
		_0133CloneGraph.Node n2 = test.new Node();
		_0133CloneGraph.Node n3 = test.new Node();
		_0133CloneGraph.Node n4 = test.new Node();
		n1.val = 1;
		n1.neighbors = Arrays.asList(n2, n4);
		n2.val = 2;
		n2.neighbors = Arrays.asList(n1, n3);
		n3.val = 3;
		n3.neighbors = Arrays.asList(n2, n4);
		n4.val = 4;
		n4.neighbors = Arrays.asList(n1, n3);
		System.out.println(test.cloneGraph(n1).toString());
	}
}