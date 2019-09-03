
public class _0231PowerOfTwo {
    public boolean isPowerOfTwo(int n) {
    	return n <= 0 ? false : (Integer.bitCount(n) == 1 ? true : false); 
    }
}
