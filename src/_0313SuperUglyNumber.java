
public class _0313SuperUglyNumber {
    public int nthSuperUglyNumber(int n, int[] primes) {
        int[] nums = new int[n];
        int l = primes.length;
		int[] indices = new int[l];
        for (int i = 0; i < l; i++) indices[i] = 0;
        nums[0] = 1;
        for (int i = 1; i < n; i++) {
        	nums[i] = Integer.MAX_VALUE;
        	for (int j = 0; j < l; j++) nums[i] = Integer.min(nums[i], nums[indices[j]] * primes[j]);
        	for (int j = 0; j < l; j++) if (nums[i] == nums[indices[j]] * primes[j]) indices[j]++;
        }
        return nums[n - 1];
    }
}
