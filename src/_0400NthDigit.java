
public class _0400NthDigit {
    public int findNthDigit(int n) {
        int level = 1;
        long count = level * 9 * (long)Math.pow(10, level - 1);
        while (n > count) {
        	n -= count;
        	level++;
        	count = level * 9 * (long)Math.pow(10, level - 1);
        }
        int div = (n - 1) / level;
        int res = (n - 1) % level;
        long num = (long)Math.pow(10, level - 1) + div;
        return (int)(num / (long)Math.pow(10, level - res - 1) % 10);
    }
}
