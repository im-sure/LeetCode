import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class _0133CloneGraph {
    public Node cloneGraph(Node node) {
    	Node newNode = new Node(node.val, new ArrayList<>());
    	Map<Integer, Node> nodes = new HashMap<>();
    	nodes.put(node.val, newNode);
    	Map<Integer, Set<Integer>> visited = new HashMap<>();
    	cloneGraph(node, newNode, nodes, visited);
    	return newNode;
    }
    
    public void cloneGraph(Node node, Node newNode, Map<Integer, Node> nodes, Map<Integer, Set<Integer>> visited) {
		if (!visited.containsKey(node.val)) {
			visited.put(node.val, new HashSet<>());
		}
    	for (Node neighbor : node.neighbors) {
    		if (!visited.get(node.val).contains(neighbor.val)) {
    			visited.get(node.val).add(neighbor.val);
    			Node newNeighbor = null;
    			if (nodes.containsKey(neighbor.val)) {
    				newNeighbor = nodes.get(neighbor.val);
    			} else {
    				newNeighbor = new Node(neighbor.val, new ArrayList<>());
    				nodes.put(neighbor.val, newNeighbor);
    			}
    			newNode.neighbors.add(newNeighbor);
    			cloneGraph(neighbor, newNeighbor, nodes, visited);
    		}
    	}
    }
    
    public class Node {
        public int val;
        public List<Node> neighbors;

        public Node() {}

        public Node(int _val, List<Node> _neighbors) {
            val = _val;
            neighbors = _neighbors;
        }
    }
}
