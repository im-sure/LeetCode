
public class _0374GuessNumberHigherOrLower {
    public int guessNumber(int n) {
    	int h = n;
    	int l = 0;
    	int r = h + (l - h) / 2;
    	int g = guess(r);
        while (g != 0) {
        	if (h - l == 1) return g == -1 ? l : h;
        	else if (g == -1) h = r;
        	else l = r;
        	r = h + (l - h) / 2;
        	g = guess(r);
        }
        return r;
    }
}
