import java.util.HashMap;
import java.util.Map;

public class _0169MajorityElement {
	public int majorityElement(int[] nums) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
        	if (!map.containsKey(nums[i])) map.put(nums[i], 1);
        	else map.replace(nums[i], map.get(nums[i]) + 1);
        	if (map.get(nums[i]) > nums.length / 2) return nums[i];
        }
        return 0;
    }
}
