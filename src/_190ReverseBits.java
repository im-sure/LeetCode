
public class _190ReverseBits {
    public int reverseBits(int n) {
        int r = 0;
        for (int i = 0; i < 32; i++) {
        	r += n & 1;
        	n >>>= 1;
        	if (i < 31) r <<= 1;
        }
        return r;
    }
}
