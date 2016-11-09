
public class _441ArrangingCoins {
    public int arrangeCoins(int n) {
        int count = 0;
        while (n >= (count + 1)) {
        	count++;
        	n -= count;
        }
        return count;
    }
}
