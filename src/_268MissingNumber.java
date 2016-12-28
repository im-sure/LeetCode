
public class _268MissingNumber {
    public int missingNumber(int[] nums) {
        int xor = 0;
        int l = nums.length;
    	for (int i = 0; i < l; i++) xor ^= i ^ nums[i];
    	return xor ^ l;
    }
}
