
public class _0343IntegerBreak {
    public int integerBreak(int n) {
    	if (n == 2) return 1;
    	else if (n == 3) return 2;
        int power = n / 3;
        int reg = n % 3;
        int i = (int)Math.pow(3, power);
        if (reg == 1) i = i / 3 * 4;
        else if (reg == 2) i *= 2;
        return i;
    }
}
