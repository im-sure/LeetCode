import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class _347TopKFrequentElements {
    public List<Integer> topKFrequent(int[] nums, int k) {
    	List<Integer> list = new ArrayList<Integer>();
    	Map<Integer, Integer> map = new HashMap<Integer, Integer>();
    	int l = nums.length;
    	List<Integer>[] count = new List[l + 1];
    	for (int i = 0; i < l; i++) {
    		if (map.containsKey(nums[i])) map.replace(nums[i], map.get(nums[i]) + 1);
    		else map.put(nums[i], 1);
    	}
    	for (int key : map.keySet()) {
    		int val = map.get(key);
    		if (count[val] == null) count[val] = new ArrayList<Integer>();
    		count[val].add(key);
    	}
    	for (int i = l; i >= 0 && list.size() < k; i--) {
    		if (count[i] != null) list.addAll(count[i]);
    	}
    	return list;
    }
}
