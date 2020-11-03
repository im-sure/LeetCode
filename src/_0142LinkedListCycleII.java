public class _0142LinkedListCycleII {
  public ListNode detectCycle(ListNode head) {
    ListNode fast = head;
    ListNode slow = head;
    while (fast != null) {
      fast = fast.next;
      fast = fast == null ? null : fast.next;
      slow = slow.next;
      if (fast == slow) {
        break;
      }
    }
    if (fast == null) {
      return null;
    }
    ListNode res = head;
    while (res != fast) {
      fast = fast.next;
      res = res.next;
    }
    return res;
  }

  class ListNode {
      int val;
      ListNode next;
      ListNode(int x) {
          val = x;
          next = null;
      }
  }
}
