import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class LeetCode {
	public static void main(String[] args) {
		_328OddEvenLinkedList test = new _328OddEvenLinkedList();
		_328OddEvenLinkedList.ListNode l1 = test.new ListNode(1);
		_328OddEvenLinkedList.ListNode l2 = test.new ListNode(2);
		_328OddEvenLinkedList.ListNode l3 = test.new ListNode(3);
		_328OddEvenLinkedList.ListNode l4 = test.new ListNode(4);
		_328OddEvenLinkedList.ListNode l5 = test.new ListNode(5);
		l1.next = l2;
		l2.next = l3;
		l3.next = l4;
		l4.next = l5;
		_328OddEvenLinkedList.ListNode result = test.oddEvenList(l1);
    	while (result != null) {
    		System.out.println(result.val);
    		result = result.next;
    	}
	}
}