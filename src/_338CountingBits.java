
public class _338CountingBits {
    public int[] countBits(int num) {
        int[] bits = new int[num + 1];
        int level = 0;
        bits[0] = 0;
        for (int i = 1; i <= num; i++) {
        	int n = 1 << level;
        	if (i == n) bits[i] = 1;
        	else if (i < n + n / 2) bits[i] = bits[i - n / 2];
        	else bits[i] = bits[i - n / 2] + 1;
        	if (i + 1 == n * 2) level++;
        }
        return bits;
    }
}
