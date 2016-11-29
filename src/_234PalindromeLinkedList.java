
public class _234PalindromeLinkedList {
	ListNode h;
	
    public boolean isPalindrome(ListNode head) {
    	h = head;
    	return isPal(head);
    }
    
    public boolean isPal(ListNode p) {
        if (p == null) return true;
        boolean r = isPal(p.next);
        if (h.val != p.val) return false;
        h = h.next;
        return r;
    }
    
	public class ListNode {
		int val;
		ListNode next;
		ListNode(int x) { val = x; }
	}
}
