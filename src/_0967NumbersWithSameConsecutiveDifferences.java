import java.util.ArrayList;
import java.util.List;

public class _0967NumbersWithSameConsecutiveDifferences {
    public int[] numsSameConsecDiff(int N, int K) {
    	List<Integer> nums = new ArrayList<>();
        for (int n = 0; n < 10; n++) {
        	nums.add(n);
        }
        List<Integer> result = N == 1 ? nums : numsSameConsecDiff(2, N, K, nums);
        int[] numbers = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
        	numbers[i] = result.get(i);
        }
        return numbers;
    }
    
    private List<Integer> numsSameConsecDiff(int n, int N, int K, List<Integer> nums) {
    	List<Integer> newNums = new ArrayList<>();
    	for (Integer num : nums) {
    		if (num != 0) {
        		int unit = num % 10;
        		if (unit - K >= 0) {
        			newNums.add(num * 10 + unit - K);
        		}
        		if (K != 0 && unit + K <= 9) {
        			newNums.add(num * 10 + unit + K);
        		}
    		}
    	}
    	return n == N ? newNums : numsSameConsecDiff(n + 1, N, K, newNums); 
    }
}
