
public class _027RemoveElement {
    public int removeElement(int[] nums, int val) {
        int end = nums.length;
    	for (int i = 0; i < nums.length; i++) {
    		if (nums[i] == val)  {
    			nums[i] = nums[--end];
    		}
    	}
    	return end;
    }
}
