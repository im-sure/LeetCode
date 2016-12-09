
public class _189RotateArray {
    public void rotate(int[] nums, int k) {
    	int l = nums.length;
        k %= l;
        int[] newNums = new int[l];
    	for (int i = 0; i < k; i++) newNums[i] = nums[l - k + i];
    	for (int i = k; i < l; i++) newNums[i] = nums[i - k];
    	for (int i = 0; i < l; i++) nums[i] = newNums[i];
    }
}
