
public class _0405ConvertANumberToHexadecimal {
    public String toHex(int num) {
    	if (num == 0) return "0";
    	StringBuilder hex = new StringBuilder();
    	boolean isNegative = false;
    	if (num < 0) {
    		isNegative = true;
    		num = -num;
    	}
    	int c = 0;
    	while (num != 0) {
    		int n = num % 16;
    		if (n < 0) n = -n;
			if (isNegative) hex.append((char)(n + c == 0 ? '0' : 
				(n + c > 6 ? 16 - n - c + '0' : 6 - n - c + 'a')));
			else hex.append((char)(n > 9 ? n - 10 + 'a' : n + '0'));
			if (n + c > 0) c = 1;
			else c = 0;
			num = num / 16;
    	}
		int l = hex.length();
    	if (isNegative) for (int i = 0; i < 8 - l; i++) hex.append('f');
    	return hex.reverse().toString();
    }
}
