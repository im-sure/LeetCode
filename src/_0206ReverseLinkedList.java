
public class _0206ReverseLinkedList {
	public ListNode reverseList(ListNode head) {
		if (head == null) return null;
		ListNode tmp = null;
		ListNode tmpNext = null;
		ListNode tmpNextNext = null;
        while (head.next != null && head.next.next != null) {
        	tmpNextNext = head.next.next;
        	tmpNext = head.next;
        	head.next.next = head;
        	head.next = tmp;
        	tmp = tmpNext;
        	head = tmpNextNext;
        }
        if (head.next != null) {
        	tmpNext = head.next;
        	head.next.next = head;
        	head.next = tmp;
        	head = tmpNext;
        } else head.next = tmp;
        return head;
    }
	
	public class ListNode {
		int val;
		ListNode next;
		ListNode(int x) { val = x; }
	}
}
