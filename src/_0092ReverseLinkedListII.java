public class _0092ReverseLinkedListII {
  public ListNode reverseBetween(ListNode head, int left, int right) {
    if (left == right) {
      return head;
    }
    left--;
    right--;
    ListNode preStart = null;
    ListNode end = null;
    ListNode last = null;
    ListNode node = head;
    ListNode next = node.next;
    int index = 0;
    while (true) {
      if (index == left - 1) {
        preStart = node;
      } else if (index == left) {
        end = node;
      } else if (index > left && index <= right) {
        node.next = last;
        if (index == right) {
          end.next = next;
          if (preStart != null) {
            preStart.next = node;
          }
          if (left == 0) {
            head = node;
          }
          break;
        }
      }
      last = node;
      node = next;
      next = node == null ? null : node.next;
      index++;
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
