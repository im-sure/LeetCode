public class _0082RemoveDuplicatesFromSortedListII {
  public ListNode deleteDuplicates(ListNode head) {
    if (head == null) {
      return null;
    }
    ListNode newHead = null;
    ListNode node = null;
    ListNode last = null;
    ListNode current = head;
    ListNode next = head.next;
    while (current != null) {
      if (!isDuplicate(last, current) && !isDuplicate(current, next)) {
        if (node == null) {
          newHead = current;
          node = current;
        } else {
          node.next = current;
          node = current;
        }
      }
      last = current;
      current = current.next;
      next = current == null ? null : current.next;
    }
    if (node != null) {
      node.next = null;
    }
    return newHead;
  }

  private boolean isDuplicate(ListNode n1, ListNode n2) {
    return n1 != null && n2 != null && n1.val == n2.val;
  }

  public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
}
