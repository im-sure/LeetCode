
public class _067AddBinary {
    public String addBinary(String a, String b) {
        StringBuilder sb = new StringBuilder();
        char c = '0';
        int la = a.length() - 1;
        int lb = b.length() - 1;
        while (la != -1 || lb != -1) {
        	char thisa = la != -1 ? a.charAt(la--) : '0';
        	char thisb = lb != -1 ? b.charAt(lb--) : '0';
        	sb.append((char)(thisa ^ thisb ^ c));
        	if (thisa != thisb && c == '1') c = '1';
        	else if (thisa == thisb && thisa == '1') c = '1';
        	else c = '0';
        }
        if (c == '1') sb.append(c);
        return sb.reverse().toString();
    }
}
