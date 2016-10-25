
public class _258AddDigits {
    public int addDigits(int num) {
    	return (num % 9 == 0) && num != 0 ? 9 : num % 9;
    }
}
