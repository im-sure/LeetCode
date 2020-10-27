import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class _0023MergeKSortedLists {
  public ListNode mergeKLists(ListNode[] lists) {
    Queue<ListNode> minStack = new PriorityQueue<>(new Comparator<ListNode>(){
      @Override
      public int compare(ListNode n1, ListNode n2) {
        return n1.val - n2.val;
      }
    });
    for (ListNode list : lists) {
      if (list != null) {
        minStack.add(list);
      }
    }
    ListNode res = null;
    ListNode current = null;
    while(!minStack.isEmpty()) {
      ListNode minNode = minStack.poll();
      if (res == null) {
        res = minNode;
        current = minNode;
      } else {
        current.next = minNode;
        current = minNode;
      }
      if (minNode.next != null) {
        minStack.add(minNode.next);
      }
    }
    return res;
  }



  public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
}
