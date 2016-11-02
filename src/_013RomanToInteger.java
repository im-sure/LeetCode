
public class _013RomanToInteger {
    public int romanToInt(String s) {
        int r = 0;
        int tmp = 0;
    	for (int i = s.length() - 1; i >= 0; i--) {
    		int n = 0;
    		char c = s.charAt(i);
    		if (c == 'I') n = 1;
    		else if (c == 'V') n = 5;
    		else if (c == 'X') n = 10;
    		else if (c == 'L') n = 50;
    		else if (c == 'C') n = 100;
    		else if (c == 'D') n = 500;
    		else if (c == 'M') n = 1000;
    		if (tmp <= n || tmp == 0) r += n;
    		else r -= n;
    		tmp = n;
    	}
    	return r;
    }
}
