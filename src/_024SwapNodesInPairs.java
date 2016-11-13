
public class _024SwapNodesInPairs {
    public ListNode swapPairs(ListNode head) {
        if (head == null) return null;
        else if (head.next == null) return head;
        ListNode newHead = head.next;
        ListNode lastNode = null;
        while (head != null) {
        	if (head.next != null) {
	            ListNode thisN = head;
	            ListNode nextN = head.next;
	            head = head.next.next;
	            nextN.next = thisN;
	            if (lastNode != null) lastNode.next = nextN;
	            thisN.next = head;
	            lastNode = thisN;
        	} else head = null;
        }
        return newHead;
    }
    
	public class ListNode {
		int val;
		ListNode next;
		ListNode(int x) { val = x; }
	}
}
