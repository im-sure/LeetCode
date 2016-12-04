
public class _396RotateFunction {
    public int maxRotateFunction(int[] A) {
		int l = A.length;
		if (l == 0) return 0;
        int first = 0;
        int offset = 0;
        int sup = 0;
        for (int i = 0; i < l; i++) {
        	first += i * A[i];
        	offset += A[i];
        }
        int max = first;
        for (int i = 0; i < l - 1; i++) {
        	sup += l * A[i];
        	int f = first - offset * (i + 1) + sup;
        	max = max > f ? max : f;
        }
        return max;
    }
}
