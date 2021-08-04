import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class LeetCode {
	public static void main(String[] args) {
    _0025ReverseNodesInKGroup test = new _0025ReverseNodesInKGroup();
    _0025ReverseNodesInKGroup.ListNode n1 = test.new ListNode(1);
    _0025ReverseNodesInKGroup.ListNode n2 = test.new ListNode(2);
    _0025ReverseNodesInKGroup.ListNode n3 = test.new ListNode(3);
    _0025ReverseNodesInKGroup.ListNode n4 = test.new ListNode(4);
    _0025ReverseNodesInKGroup.ListNode n5 = test.new ListNode(5);
    _0025ReverseNodesInKGroup.ListNode n6 = test.new ListNode(6);
    n1.next = n2;
    n2.next = n3;
    n3.next = n4;
    n4.next = n5;
    n5.next = n6;
    System.out.println(test.reverseKGroup(n1, 3));
  }
}