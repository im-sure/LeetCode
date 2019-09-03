
public class _0477TotalHammingDistance {
    public int totalHammingDistance(int[] nums) {
        int total = 0;
        int l = nums.length;
        for (int i = 0; i < 32; i++) {
        	int count = 0;
        	for (int j = 0; j < l; j++) count += (nums[j] >> i) & 1;
        	total += count * (l - count);
        }
        return total;
    }
}
