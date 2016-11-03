import java.util.List;

public class LeetCode {
	public static void main(String[] args){
		_206ReverseLinkedList test = new _206ReverseLinkedList();
		_206ReverseLinkedList.ListNode l1 = test.new ListNode(1);
		_206ReverseLinkedList.ListNode l2 = test.new ListNode(2);
		_206ReverseLinkedList.ListNode l3 = test.new ListNode(3);
		_206ReverseLinkedList.ListNode l4 = test.new ListNode(4);
		_206ReverseLinkedList.ListNode l5 = test.new ListNode(5);
		_206ReverseLinkedList.ListNode l6 = test.new ListNode(6);
		l1.next = l2;
		l2.next = l3;
		l3.next = l4;
		l4.next = l5;
		l5.next = l6;
		_206ReverseLinkedList.ListNode result = test.reverseList(l1);
		while (result.next != null) {
			System.out.println(result.val);
			result = result.next;
		}
		System.out.println(result.val);
	}
}