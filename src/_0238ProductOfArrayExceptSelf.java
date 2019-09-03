
public class _0238ProductOfArrayExceptSelf {
    public int[] productExceptSelf(int[] nums) {
        int l = nums.length;
        int[] r = new int[l];
        r[0] = 1;
        for (int i = 1; i < l; i++) r[i] = r[i - 1] * nums[i - 1];
        int pre = 1;
        for (int i = l - 1; i >= 0; i--) {
        	r[i] *= pre;
        	pre *= nums[i]; 
        }
        return r;
    }
}
