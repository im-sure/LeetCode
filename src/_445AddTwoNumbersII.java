
public class _445AddTwoNumbersII {
    int len1 = 0;
    int len2 = 0;
    int max1 = 0;
    int max2 = 0;
    ListNode newList = new ListNode(1);
    
	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		if (l1 == null) return l2;
		else if (l2 == null) return l1;
		ListNode n1 = l1;
		ListNode n2 = l2;
		while (n1.next != null || n2.next != null) {
        	if (n1.next != null) {
        		n1 = n1.next;
        		len1++;
        	}
        	if (n2.next != null) {
        		n2 = n2.next;
        		len2++;
        	}
        }
		max1 = len1;
		max2 = len2;
		newList.next = new ListNode(0);
		return hasCarry(l1, l2, newList.next) ? newList : newList.next;
    }
    
    public boolean hasCarry(ListNode l1, ListNode l2, ListNode lNew) {
    	boolean hasCarry = false;
    	if (len1 > len2) {
    		len1--;
    		lNew.next = new ListNode(0);
    		hasCarry = hasCarry(l1.next, l2, lNew.next);
    	}
    	else if (len2 > len1) {
    		len2--;
    		lNew.next = new ListNode(0);
    		hasCarry = hasCarry(l1, l2.next, lNew.next);
    	} else if (len1 == len2 && len1 != 0) {
    		len1--;
    		len2--;
    		lNew.next = new ListNode(0);
    		hasCarry = hasCarry(l1.next, l2.next, lNew.next);
    	}
    	int val =  (len1 > max1 ? 0 : l1.val) + (len2 > max2 ? 0 : l2.val) + (hasCarry ? 1 : 0);
    	len1++;
    	len2++;
    	lNew.val = val % 10;
    	return val >= 10 ? true : false;
    }
    
	public class ListNode {
		int val;
		ListNode next;
		ListNode(int x) { val = x; }
	}
}
