
public class _0342PowerOfFour {
    public boolean isPowerOfFour(int num) {
        return (num & 0x55555555) != 0 && Integer.bitCount(num) == 1 ? true : false;
    }
}
