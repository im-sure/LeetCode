
public class _0083RemoveDuplicatesFromSortedList {
	public ListNode deleteDuplicates(ListNode head) {
        if (head == null) return null;
        ListNode thisNode = head;
        while (thisNode.next != null) {
        	if (thisNode.val == thisNode.next.val)
        		thisNode.next = thisNode.next.next;
        	else thisNode = thisNode.next;
        }
        return head;
    }
	
	public class ListNode {
		int val;
		ListNode next;
		ListNode(int x) { val = x; }
	}
}
