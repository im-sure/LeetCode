import java.util.ArrayList;
import java.util.List;

public class _0300LongestIncreasingSubsequence {
    public int lengthOfLIS(int[] nums) {
    	if (nums == null || nums.length == 0) return 0;
    	List<Integer> list = new ArrayList<Integer>();
    	for (int i = 0; i < nums.length; i++) {
    		boolean add = true;
    		int index = 0;
    		int num = nums[i];
			for (int n : list) {
    			if (num == n) {
    				add = false;
    				break;
    			}
    			else if (num < n) {
    				list.remove(index);
    				list.add(index, num);
    				add = false;
    				break;
    			} else index++;
    		}
    		if (add) list.add(num);
    	}
        return list.size();
    }
}
