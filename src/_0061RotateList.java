public class _0061RotateList {
  public ListNode rotateRight(ListNode head, int k) {
    if (head == null) {
      return null;
    }
    int length = 0;
    ListNode node = head;
    ListNode tail = null;
    while (node != null) {
      tail = node;
      length++;
      node = node.next;
    }
    int cut = length - k % length;
    if (cut == length) {
      return head;
    }
    node = head;
    while (--cut > 0) {
      node = node.next;
    }
    tail.next = head;
    head = node.next;
    node.next = null;
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
