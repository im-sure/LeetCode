import java.util.Deque;
import java.util.LinkedList;

public class _0002AddTwoNumbers {
  public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
    if (l1 == null) {
      return l2;
    }
    if (l2 == null) {
      return l1;
    }
    Deque<ListNode> s1 = new LinkedList<>();
    Deque<ListNode> s2 = new LinkedList<>();
    while (l1 != null) {
      s1.addLast(l1);
      l1 = l1.next;
    }
    while (l2 != null) {
      s2.addLast(l2);
      l2 = l2.next;
    }
    ListNode head = null;
    ListNode next = null;
    int c = 0;
    while (!s1.isEmpty() || !s2.isEmpty()) {
      int val1 = s1.isEmpty() ? 0 : s1.pop().val;
      int val2 = s2.isEmpty() ? 0 : s2.pop().val;
      int val = val1 + val2 + c;
      ListNode node = new ListNode(val % 10);
      if (head == null) {
        head = node;
      }
      if (next != null) {
        next.next = node;
      }
      next = node;
      c = val / 10;
    }
    if (c != 0) {
      ListNode node = new ListNode(c);
      next.next = node;
    }
    return head;
  }

  public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
}
