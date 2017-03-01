
public class _416PartitionEqualSubsetSum {
    public boolean canPartition(int[] nums) {
        int l = nums.length;
        int sum = 0;
        for (int i = 0; i < l; i++) sum += nums[i];
        if (sum % 2 != 0) return false;
        int half = sum / 2;
        boolean r[] = new boolean[half + 1];
        r[0] = true;
        for (int i = 0; i < l; i++) {
        	for (int j = half; j >= nums[i]; j--) {
        		r[j] = r[j] || r[j - nums[i]];
        	}
        }
        return r[half];
    }
}
