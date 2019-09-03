
public class _0328OddEvenLinkedList {
    public ListNode oddEvenList(ListNode head) {
    	if (head == null) return null;
    	else if (head.next == null) return head;
    	ListNode firstOdd = head;
    	ListNode firstEven = head.next;
    	ListNode tmpOdd = head;
    	ListNode tmpEven = head.next;
    	ListNode thisNode = firstEven.next;
    	boolean isOdd = true;
    	while (thisNode != null) {
    		if (isOdd) {
    			tmpOdd.next = thisNode;
    			tmpOdd = tmpOdd.next;
    		} else {
    			tmpEven.next = thisNode;
    			tmpEven = tmpEven.next;
    		}
    		isOdd = !isOdd;
    		thisNode = thisNode.next;
    	}
    	tmpOdd.next = firstEven;
    	tmpEven.next = null;
    	return firstOdd;
    }
    
	public class ListNode {
		int val;
		ListNode next;
		ListNode(int x) { val = x; }
	}
}
