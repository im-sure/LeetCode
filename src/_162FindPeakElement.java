
public class _162FindPeakElement {
    public int findPeakElement(int[] nums) {
    	return findPeakElement(nums, 0, nums.length - 1);
    }
    
    private int findPeakElement(int[] nums, int l, int r) {
    	if (l == r) return l;
    	else if (r - l == 1) {
    		if (nums[l] > nums[r]) return l;
    		else return r;
    	} else {
    		int m = (l + r) / 2;
    		if (nums[m - 1] < nums[m] && nums[m] > nums[m + 1]) return m;
    		else if (nums[m - 1] < nums[m] && nums[m] < nums[m + 1]) return findPeakElement(nums, m + 1, r);
    		else return findPeakElement(nums, l, m - 1);
    	}
    }
}
