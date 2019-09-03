
public class _0153FindMinimumInRotatedSortedArray {
    public int findMin(int[] nums) {
        int h = nums.length - 1;
        int l = 0;
        int r = 0;
        while (h > l) {
        	if (nums[l] > nums[h]) {
            	r = l;
        		l = l + (h - l + 1) / 2;
        	} else {
        		h = l;
        		l = r + 1;
        		r++;
        	}
        }
        return nums[h];
    }
}
