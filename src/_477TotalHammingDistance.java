
public class _477TotalHammingDistance {
    public int totalHammingDistance(int[] nums) {
        int total = 0;
        int l = nums.length;
        for (int i = 0; i < 32; i++) {
        	int count = 0;
        	int bit = 1 << i;
        	for (int j = 0; j < l; j++) count += (bit & nums[j]) == 0 ? 0 : 1;
        	total += count * (l - count);
        }
        return total;
    }
}
