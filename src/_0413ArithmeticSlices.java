
public class _0413ArithmeticSlices {
    public int numberOfArithmeticSlices(int[] A) {
        int l = A.length;
        if (l < 3) return 0;
        int num = 0;
        int count = 0;
        int interval = 0;
        for (int i = 1; i < l; i++) {
        	if (A[i] - A[i - 1] == interval && i != 1) {
        		count++;
        	} else {
        		interval = A[i] - A[i - 1];
        		if (count > 0) num += count * (count + 1) / 2;
        		count = 0;
        	}
        }
        if (count > 0) num += count * (count + 1) / 2;
        return num;
    }
}
