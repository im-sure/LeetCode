public class _0086PartitionList {
  public ListNode partition(ListNode head, int x) {
    if (head == null) {
      return null;
    }
    ListNode firstHead = null;
    ListNode firstNode = null;
    ListNode secondHead = null;
    ListNode secondNode = null;
    while (head != null) {
      if (head.val < x) {
        if (firstNode == null) {
          firstHead = head;
          firstNode = head;
        } else {
          firstNode.next = head;
          firstNode = head;
        }
      } else {
        if (secondNode == null) {
          secondHead = head;
          secondNode = head;
        } else {
          secondNode.next = head;
          secondNode = head;
        }
      }
      head = head.next;
    }
    if (firstHead != null) {
      firstNode.next = secondHead;
    } else {
      firstHead = secondHead;
    }
    if (secondNode != null) {
      secondNode.next = null;
    }
    return firstHead;
  }

  public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
}
