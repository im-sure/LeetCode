
public class _0394DecodeString {
    public String decodeString(String s) {
        int start = 0;
        int end = 0;
        int repeat = 0;
        int brackets = 0;
        StringBuilder sb = new StringBuilder();
    	for (int i = 0; i < s.length(); i++) {
    		char c = s.charAt(i);
        	if (c >= '0' && c <= '9' && brackets == 0) repeat = repeat * 10 + c - '0';
        	else if (c >= 'a' && c <= 'z' && repeat == 0)sb.append(c);
        	else if (c == '[') {
        		if (brackets == 0) start = i + 1;
        		brackets++;
        	} else if (c == ']') {
        		brackets--;
        		if (brackets == 0) {
        			end = i;
        			String sub = decodeString(s.substring(start, end));
        			for (int j = 0; j < repeat; j++) sb.append(sub);
        			start = 0;
        			end = 0;
        			repeat = 0;
        			brackets = 0;
        		}
        	}
        }
    	return sb.toString();
    }
}
