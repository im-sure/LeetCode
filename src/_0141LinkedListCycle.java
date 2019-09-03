
public class _0141LinkedListCycle {
    public boolean hasCycle(ListNode head) {
    	if (head == null) return false;
        ListNode fastNode = head;
        ListNode slowNode = head;
        int count = 0;
        while (fastNode.next != null) {
        	fastNode = fastNode.next;
        	count++;
        	if (count == 2) {
        		slowNode = slowNode.next;
        		count = 0;
        	}
        	if (fastNode == slowNode) return true;
        }
        return false;
    }
    
    class ListNode {
    	int val;
    	ListNode next;
    	ListNode(int x) {
    		val = x;
    		next = null;
    	}
    }
}
