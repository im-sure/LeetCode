
public class _0075SortColors {
    public void sortColors(int[] nums) {
        if (nums == null || nums.length <= 1) return;
        int r = 0;
        int b = nums.length - 1;
        int index = 1;
        while (index <= b) {
        	if (nums[r] == 1) {
        		for (;index <= b;) {
        			if (nums[index] == 0) {
        				nums[r++] = 0;
        				nums[index++] = 1;
        				break;
        			} else if (nums[index] == 2) {
        				nums[index] = nums[b];
        				nums[b--] = 2;
        			} else index++;
        		}
        	} else if (nums[r] == 2) {
        		nums[r] = nums[b];
				    nums[b--] = 2;
        	} else {
        		r++;
        		index++;
        	}
        }
    }
}
