
public class _371SumofTwoIntegers {
	public int getSum(int a, int b) {
		int sum = 0;
		int c = (a & b) << 1;
		int d = a ^ b;
        while (c != 0) {
        	sum = d;
        	d = d ^ c;
        	c = (c & sum) << 1;
        }
        sum = d;
        return sum;
    }
}
