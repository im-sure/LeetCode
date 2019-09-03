import java.util.Random;

public class _0382LinkedListRandomNode {
	ListNode head;
	Random r;
	
	public _0382LinkedListRandomNode(ListNode head) {
        this.head = head;
        r = new Random();
    }
    
    public int getRandom() {
    	ListNode thisN = head;
    	ListNode result = null;
        for (int n = 1; thisN != null; n++) {
        	if (r.nextInt(n) == 0) result = thisN;
        	thisN = thisN.next;
        }
    	return result.val;
    }
	
	public class ListNode {
		int val;
		ListNode next;
		ListNode(int x) { val = x; }
	}
}
