import java.util.List;

public class LeetCode {
	public static void main(String[] args) {
		_445AddTwoNumbersII test = new _445AddTwoNumbersII();
		_445AddTwoNumbersII.ListNode l1 = test.new ListNode(7);
		_445AddTwoNumbersII.ListNode l11 = test.new ListNode(2);
		_445AddTwoNumbersII.ListNode l12 = test.new ListNode(4);
		_445AddTwoNumbersII.ListNode l13 = test.new ListNode(3);
		_445AddTwoNumbersII.ListNode l2 = test.new ListNode(5);
		_445AddTwoNumbersII.ListNode l21 = test.new ListNode(6);
		_445AddTwoNumbersII.ListNode l22 = test.new ListNode(4);
		_445AddTwoNumbersII.ListNode l23 = test.new ListNode(0);
		l1.next = l11;
		l11.next = l12;
		l12.next = l13;
		l2.next = l21;
		l21.next = l22;
		l22.next = l23;
		l1 = test.addTwoNumbers(l1, l2);
		while(l1 != null) {
			System.out.print(l1.val);
			l1 = l1.next;
		}
	}
}