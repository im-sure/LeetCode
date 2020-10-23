public class _0148SortList {
  public ListNode sortList(ListNode head) {
    if (head == null || head.next == null) {
      return head;
    }
    return cut(head, length(head));
  }

  private int length(ListNode head) {
    int length = 0;
    while (head != null) {
      length++;
      head = head.next;
    }
    return length;
  }

  private ListNode cut(ListNode head, int length) {
    if (head.next == null) {
      return head;
    }
    int mid = length / 2;
    ListNode lHead = head;
    ListNode rHead = head;
    int n = 0;
    ListNode tail = null;
    while (n < mid) {
      tail = rHead;
      rHead = rHead.next;
      n++;
    }
    tail.next = null;
    return merge(lHead, rHead);
  }

  private ListNode merge(ListNode lHead, ListNode rHead) {
    lHead = cut(lHead, length(lHead));
    rHead = cut(rHead, length(rHead));
    ListNode lCurrent = lHead;
    ListNode rCurrent = rHead;
    ListNode head = null;
    ListNode current = null;
    while (lCurrent != null || rCurrent != null) {
      ListNode tmp = null;
      if (lCurrent != null && rCurrent != null) {
        if (lCurrent.val < rCurrent.val) {
          tmp = lCurrent;
          lCurrent = lCurrent.next;
        } else {
          tmp = rCurrent;
          rCurrent = rCurrent.next;
        }
      } else if (lCurrent != null) {
        tmp = lCurrent;
        lCurrent = lCurrent.next;
      } else {
        tmp = rCurrent;
        rCurrent = rCurrent.next;
      }
      if (current == null) {
        current = tmp;
        head = tmp;
      } else {
        current.next = tmp;
        current = tmp;
      }
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
