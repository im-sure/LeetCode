
public class _0007ReverseInteger {
    public int reverse(int x) {
    	if (x == 0) return 0;
        boolean isNeg = x < 0 ? true : false;
        String s = new StringBuilder(String.valueOf(Math.abs(x))).reverse().toString();
        String max = "2147483647";
        if (s.length() >= 10 && max.compareTo(s) < 0) return 0;
        return Integer.valueOf((isNeg ? "-" : "") + s);
    }
}
