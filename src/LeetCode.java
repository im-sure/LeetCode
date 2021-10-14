import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class LeetCode {
	public static void main(String[] args) {
    _0092ReverseLinkedListII test = new _0092ReverseLinkedListII();
    _0092ReverseLinkedListII.ListNode n1 = test.new ListNode(1);
    _0092ReverseLinkedListII.ListNode n2 = test.new ListNode(2);
    _0092ReverseLinkedListII.ListNode n3 = test.new ListNode(3);
    _0092ReverseLinkedListII.ListNode n4 = test.new ListNode(4);
    _0092ReverseLinkedListII.ListNode n5 = test.new ListNode(5);
    n1.next = n2;
    n2.next = n3;
    n3.next = n4;
    n4.next = n5;
    _0092ReverseLinkedListII.ListNode n = test.reverseBetween(n1, 2, 4);
    while (n != null) {
      System.out.println(n.val);
      n = n.next;
    }
  }
}