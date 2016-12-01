
public class _203RemoveLinkedListElements {
    public ListNode removeElements(ListNode head, int val) {
        while (head != null && head.val == val) head = head.next;
        if (head == null) return null;
        ListNode thisN = head;
        ListNode nextN = head.next;
        while (nextN != null) {
        	if (nextN.val == val) {
        		nextN = nextN.next;
        		thisN.next = nextN;
        	} else {
        		nextN = nextN.next;
        		thisN = thisN.next;
        	}
        }
        return head;
    }
	
	public class ListNode {
		int val;
		ListNode next;
		ListNode(int x) { val = x; }
	}
}
