import java.util.ArrayDeque;
import java.util.Deque;

public class _0239SlidingWindowMaximum {
  public int[] maxSlidingWindow(int[] nums, int k) {
    int length = nums.length;
    int[] res = new int[length > k ? length - k + 1 : 1];
    Deque<Integer> deque = new ArrayDeque<>();
    for (int i = 0; i < length; i++) {
      if (i >= k - 1 && !deque.isEmpty() && deque.peekFirst() < i - k + 1) {
        deque.removeFirst();
      }
      int value = nums[i];
      while(!deque.isEmpty() && nums[deque.peekLast()] < value) {
        deque.removeLast();
      }
      deque.addLast(i);
      if (i >= k - 1) {
        res[i - k + 1] = nums[deque.peekFirst()];
      }
    }
    return res;
  }
}
