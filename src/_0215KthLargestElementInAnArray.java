import java.util.PriorityQueue;
import java.util.Queue;

public class _0215KthLargestElementInAnArray {
    public int findKthLargest(int[] nums, int k) {
    	int l = nums.length;
        Queue<Integer> priorityQueue = new PriorityQueue<Integer>(l);
        for (int n : nums) priorityQueue.add(n);
        for (int i = 0; i < l - k; i++) priorityQueue.poll();
        return priorityQueue.peek();
    }
}
