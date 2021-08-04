public class _0025ReverseNodesInKGroup {
  public ListNode reverseKGroup(ListNode head, int k) {
    if (k == 1) {
      return head;
    }
    ListNode preGroupLast = null;
    ListNode node = head;
    while (node != null) {
      ListNode tail = node;
      for (int i = 1; i < k; i++) {
        tail = tail.next;
        if (tail == null) {
          break;
        }
      }
      if (tail == node || tail == null) {
        break;
      }
      if (preGroupLast != null) {
        preGroupLast.next = tail;
      } else {
        head = tail;
      }
      ListNode nextGroupFirst = tail.next;
      ListNode pre = null;
      ListNode next = node.next;
      while (true) {
        if (pre == null) {
          preGroupLast = node;
          node.next = tail.next;
        } else {
          node.next = pre;
        }
        if (node == tail) {
          break;
        }
        pre = node;
        node = next;
        next = node.next;
      }
      node = nextGroupFirst;
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
