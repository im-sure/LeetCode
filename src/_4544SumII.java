import java.util.HashMap;
import java.util.Map;

public class _4544SumII {
    public int fourSumCount(int[] A, int[] B, int[] C, int[] D) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < A.length; i++) {
        	for (int j = 0; j < B.length; j++) {
        		int sum = A[i] + B[j];
        		map.put(sum, map.getOrDefault(sum, 0) + 1);
        	}
        }
        int r = 0;
        for (int i = 0; i < C.length; i++) {
        	for (int j = 0; j < D.length; j++) {
        		r += map.getOrDefault(- C[i] - D[j], 0);
        	}
        }
        return r;
    }
}
