
public class _279PerfectSquares {
    public int numSquares(int n) {
    	int[] dp = new int[n + 1];
    	dp[0] = 0;
    	for (int i = 1; i <= n; i++) {
    		int min = Integer.MAX_VALUE;
        	int sqrt = (int)Math.sqrt(i);
        	int j = 1;
        	while (j <= sqrt) {
        		min = Math.min(min, dp[i - j * j] + 1);
        		j++;
        	}
        	dp[i] = min;
    	}
    	return dp[n];
    }
}
