import java.util.List;

public class LeetCode {
	public static void main(String[] args){
		_024SwapNodesInPairs test = new _024SwapNodesInPairs();
		_024SwapNodesInPairs.ListNode one = test.new ListNode(1);
		_024SwapNodesInPairs.ListNode two = test.new ListNode(2);
		_024SwapNodesInPairs.ListNode three = test.new ListNode(3);
		_024SwapNodesInPairs.ListNode four = test.new ListNode(4);
		_024SwapNodesInPairs.ListNode five = test.new ListNode(5);
		_024SwapNodesInPairs.ListNode six = test.new ListNode(6);
		_024SwapNodesInPairs.ListNode seven = test.new ListNode(7);
		_024SwapNodesInPairs.ListNode eight = test.new ListNode(8);
		one.next = two;
		two.next = three;
		three.next = four;
		four.next = five;
		five.next = six;
		six.next = seven;
		seven.next = eight;
		_024SwapNodesInPairs.ListNode result = test.swapPairs(one);
		while (result != null) {
			System.out.println(result.val);
			result = result.next;
		}
	}
}