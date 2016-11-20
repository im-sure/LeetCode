
public class _026RemoveDuplicatesFromSortedArray {
    public int removeDuplicates(int[] nums) {
    	if (nums.length == 0) return 0;
        int length = 1;
        int val = nums[0];
        for (int i = 1; i < nums.length; i++) {
        	if (nums[i] != val) {
        		nums[length++] = nums[i];
        		val = nums[i];
        	}
        }
        return length;
    }
}
