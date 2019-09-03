import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class _0398RandomPickIndex {
	Map<Integer, String> map;
	Random random;
	
    public _0398RandomPickIndex(int[] nums) {
		map = new HashMap<Integer, String>();
		random = new Random();
        for (int i = 0; i < nums.length; i++) {
        	if (map.containsKey(nums[i])) map.put(nums[i], map.get(nums[i]) + "," + String.valueOf(i));
        	else map.put(nums[i], String.valueOf(i));
        }
    }
    
    public int pick(int target) {
        String s = map.get(target);
        String[] indices = s.split(",");
        int r = random.nextInt(indices.length);
        return Integer.valueOf(indices[r]);
    }
}
