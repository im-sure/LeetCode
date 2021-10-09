import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class LeetCode {
	public static void main(String[] args) {
    _0082RemoveDuplicatesFromSortedListII test = new _0082RemoveDuplicatesFromSortedListII();
    _0082RemoveDuplicatesFromSortedListII.ListNode n1 = test.new ListNode(1);
    _0082RemoveDuplicatesFromSortedListII.ListNode n2 = test.new ListNode(1);
    n1.next = n2;
    _0082RemoveDuplicatesFromSortedListII.ListNode n = test.deleteDuplicates(n1);
    while (n != null) {
      System.out.println(n.val);
      n = n.next;
    }
  }
}