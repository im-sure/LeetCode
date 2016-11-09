
public class _021MergeTwoSortedLists {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null && l2 == null) return null;
        else if (l1 == null) return l2;
        else if (l2 == null) return l1;
        ListNode thisNode = null;
        ListNode nextNode = l1;
        while (nextNode != null && l2 != null) {
        	if (nextNode.val > l2.val) {
        		if (thisNode == null) {
        			l1 = l2;
        			thisNode = l2;
        		}
        		else {
        			thisNode.next = l2;
            		thisNode = thisNode.next;
        		}
        		l2 = l2.next;
        		thisNode.next = nextNode;
        	} else {
        		if (thisNode == null) thisNode = l1;
        		else thisNode = thisNode.next;
        		nextNode = nextNode.next;
        		continue;
        	}
        }
        if (nextNode == null) thisNode.next = l2;
        return l1;
    }
    
    public class ListNode {
    	int val;
    	ListNode next;
   		ListNode(int x) { val = x; }
	}
}
