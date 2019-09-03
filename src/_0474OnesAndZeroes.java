
public class _0474OnesAndZeroes {
    public int findMaxForm(String[] strs, int m, int n) {
        int[][] nums = new int[m + 1][n + 1];
        for (String str : strs) {
        	int zeros = 0;
        	int ones = 0;
        	for (int i = 0; i < str.length(); i++) {
        		char c = str.charAt(i);
        		if (c == '0') zeros++;
        		else ones++;
        	}
        	for (int i = m; i >= zeros; i--) {
        		for (int j = n; j >= ones; j--) {
        			nums[i][j] = Integer.max(nums[i][j], nums[i - zeros][j - ones] + 1);
        		}
        	}
        }
        return nums[m][n];
    }
}
