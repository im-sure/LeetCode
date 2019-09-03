import java.util.LinkedList;
import java.util.List;

public class _0019RemoveNthNodeFromEndOfList {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        List<ListNode> list = new LinkedList<ListNode>();
        list.add(head);
        ListNode node = head.next;
        int count = 1;
        while (node != null) {
        	list.add(node);
        	if (count == n + 1) list.remove(0);
        	else count++;
        	node = node.next;
        }
        if (count == 1) return null;
        else if (count == n) return head.next;
        else if (list.size() >= 3) list.remove(0).next = list.remove(1);
        else list.remove(0).next = null;
        return head;
    }
    
    public class ListNode {
    	int val;
    	ListNode next;
    	ListNode(int x) { val = x; }
    }
}
