import java.util.HashMap;
import java.util.Map;

public class _0001TwoSum {
    public int[] twoSum(int[] nums, int target) {
        int[] indices = new int[2];
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) map.put(nums[i], i);
        for (int i = 0; i < nums.length - 1; i++) {
        	int other = target - nums[i];
        	if (map.containsKey(other) && map.get(other) != i) {
        		indices[0] = i;
    			indices[1] = map.get(other);
    			break;
        	}
        }
        return indices;
    }
}
