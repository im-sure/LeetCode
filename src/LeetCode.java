import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class LeetCode {
	public static void main(String[] args) {
    _0148SortList test = new _0148SortList();
    _0148SortList.ListNode n1 = test.new ListNode(1);
    _0148SortList.ListNode n2 = test.new ListNode(2);
    _0148SortList.ListNode n3 = test.new ListNode(3);
    _0148SortList.ListNode n4 = test.new ListNode(4);
    n1.next = n2;
    n2.next = n3;
    n3.next = n4;
    _0148SortList.ListNode head = test.sortList(n1);
    while (head != null) {
      System.out.println(head.val);
      head = head.next;
    }
		// System.out.println(test.findSubstringInWraproundString("zaba"));
	}
}