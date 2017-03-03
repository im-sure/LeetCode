import java.util.ArrayList;
import java.util.List;

public class _078Subsets {
    public List<List<Integer>> subsets(int[] nums) {
    	List<List<Integer>> list = new ArrayList<List<Integer>>();
    	for (int i = 1; i <= nums.length; i++) {
    		List<List<Integer>> tmp = subsets(0, nums, i);
    		for (List<Integer> l : tmp) list.add(l);
    	}
    	list.add(new ArrayList<Integer>());
    	return list;
    }
    
    public List<List<Integer>> subsets(int s, int[] nums, int k) {
    	List<List<Integer>> list = new ArrayList<List<Integer>>();
    	if (k == 1) {
	    	for (int i = s; i < nums.length; i++) {
	        	List<Integer> l = new ArrayList<Integer>();
	        	l.add(nums[i]);
	    		list.add(l);
	    	}
    	} else {
    		list = subsets(s + 1, nums, k - 1);
    		for (List<Integer> l : list) l.add(nums[s]);
    		if ((nums.length - s) >= k) {
	    		List<List<Integer>> tmp = subsets(s + 1, nums, k);
	    		for (List<Integer> l : tmp) list.add(l);
    		}
    	}
    	return list;
    }
}
