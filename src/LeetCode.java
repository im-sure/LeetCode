import java.util.List;

public class LeetCode {
	public static void main(String[] args) {
		_234PalindromeLinkedList test = new _234PalindromeLinkedList();
		_234PalindromeLinkedList.ListNode one = test.new ListNode(1);
		_234PalindromeLinkedList.ListNode two = test.new ListNode(2);
		one.next = two;
		//boolean result = test.containsNearbyDuplicate(a, b);
		display(one);
		System.out.println(one.val);
	}
	
	public static void display(_234PalindromeLinkedList.ListNode tmp) {
		tmp = tmp.next;
		System.out.println(tmp.val);
	}
}