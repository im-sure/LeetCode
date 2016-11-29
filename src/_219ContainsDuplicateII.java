import java.util.HashMap;
import java.util.Map;

public class _219ContainsDuplicateII {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
    	if (nums.length < 2) return false;
    	Map<Integer, Integer> map = new HashMap<Integer, Integer>();
    	for (int i = 0; i < nums.length; i++) {
    		int n = nums[i];
			if (map.containsKey(n)) {
    			if (i - map.get(n) <= k) return true;
    			else map.replace(n, i);
    		} else map.put(n, i);
    	}
    	return false;
    }
}
