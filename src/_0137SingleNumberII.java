
public class _0137SingleNumberII {
    public int singleNumber(int[] nums) {
        int r = 0;
        for (int i = 0; i < 32; i++) {
        	int bit = 1 << i;
        	int sum = 0;
        	for (int j = 0; j < nums.length; j++) {
        		if ((nums[j] & bit) != 0) sum++;
        	}
        	if ((sum % 3) != 0) r += bit;
        }
        return r;
    }
}
