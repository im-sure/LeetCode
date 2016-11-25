import java.util.List;

public class LeetCode {
	public static void main(String[] args) {
		_019RemoveNthNodeFromEndOfList test = new _019RemoveNthNodeFromEndOfList();
		_019RemoveNthNodeFromEndOfList.ListNode a = test.new ListNode(1);
		_019RemoveNthNodeFromEndOfList.ListNode b = test.new ListNode(2);
		a.next = b;
		_019RemoveNthNodeFromEndOfList.ListNode result = test.removeNthFromEnd(a, 1);
		System.out.println(result);
	}
}