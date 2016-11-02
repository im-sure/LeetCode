
public class _371SumOfTwoIntegers {
	public int getSum(int a, int b) {
		int c = (a & b) << 1;
		int d = a ^ b;
        while (c != 0) {
        	int tmp = d;
        	d = d ^ c;
        	c = (c & tmp) << 1;
        }
        return d;
    }
}
