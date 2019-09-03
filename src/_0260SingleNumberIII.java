
public class _0260SingleNumberIII {
    public int[] singleNumber(int[] nums) {
        int l = nums.length;
    	int xor = 0;
    	for (int i = 0; i < l; i++) xor ^= nums[i];
    	for (int i = 0; i < 32; i++) {
    		int bit = 1 << i;
    		if ((xor & bit) != 0) xor = bit;
    	}
    	int xor0 = 0;
    	int xor1 = 0;
    	for (int i = 0; i < l; i++) {
    		if ((nums[i] & xor) == 0) xor0 ^= nums[i];
    		else xor1 ^= nums[i];
    	}
    	return new int[]{xor0, xor1};
    }
}
