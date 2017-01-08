import java.util.HashMap;
import java.util.Map;

public class _377CombinationSumIV {
	Map<Integer, Integer> map = new HashMap<Integer, Integer>();
	
    public int combinationSum4(int[] nums, int target) {
        int count = 0;
        if (target < 0) return 0;
        else if (target == 0) return 1;
    	if (map.containsKey(target)) return map.get(target);
        for (int n : nums) count += combinationSum4(nums, target - n);
        map.put(target, count);
        return count;
    }
}
