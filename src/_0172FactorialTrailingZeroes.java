
public class _0172FactorialTrailingZeroes {
    public int trailingZeroes(int n) {
        int r = 0;
        while (n / 5 != 0) {
        	n /= 5;
        	r += n;
        }
        return r;
    }
}
