
public class _0204CountPrimes {
    public int countPrimes(int n) {
    	if (n <= 1) return 0;
    	int[] nums = new int[n];
        int count = 0;
    	for (int i = 2; i < n; i++) {
    		if (nums[i] == 0) {
    			count++;
    			for (int j = i; j < n; j += i) nums[j] = 1;
    		}
    	}
    	return count;
    }
}
