
public class _283MoveZeroes {
    public void moveZeroes(int[] nums) {
    	if (nums.length <= 1) return;
    	int count = 0;
    	for (int i = 0; i < nums.length; i++) {
    		if (nums[i] == 0) count++;
    		else if (count != 0) {
    			nums[i - count] = nums[i];
    			nums[i] = 0;
    		}
    	}
    }
}
