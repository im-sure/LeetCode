
public class _0008StringtoIntegerATOI {
    public int myAtoi(String str) {
    	if (str.length() == 0) return 0;
        StringBuilder sb = new StringBuilder();
        char sign = ' ';
        for (int i = 0; i < str.length(); i++) {
        	char c = str.charAt(i);
        	if (sign == ' ' && c == '-') sign = '-';
        	else if (sign == ' ' && c == '+') sign = '+';
        	else if (c >= '0' && c <= '9') {
        		sb.append(c);
        		int l = sb.length();
        		if (l == 10) {
        			String s = sb.toString();
        			if (sign == '-' && s.compareTo("2147483648") > 0) return Integer.MIN_VALUE;
        			else if (sign != '-' && s.compareTo("2147483647") > 0) return Integer.MAX_VALUE;
        		} else if (l > 10) {
        			if (sign == '-') return Integer.MIN_VALUE;
        			else return Integer.MAX_VALUE;
        		}
        	} else if (sb.length() > 0) break;
        	else if (sign != ' ') return 0;
        	else if (c != ' ' && sign == ' ') return 0;
        }
        if (sb.length() == 0) return 0;
        return Integer.valueOf((sign == '-' ? "-" + sb.toString() : sb.toString()));
    }
}
