
public class _0415AddStrings {
    public String addStrings(String num1, String num2) {
        int l1 = num1.length();
        int l2 = num2.length();
        int c = 0;
        String sum = "";
        for (int i = 0; i < (l1 >= l2 ? l1 : l2); i++) {
        	int s = (l1 - i - 1 >= 0 ? num1.charAt(l1 - i - 1) - '0' : 0)
        			+ (l2 - i - 1 >= 0 ? num2.charAt(l2 - i - 1) - '0' : 0) + c;
        	sum = String.valueOf(s % 10) + sum;
        	c = s / 10;
        }
        if (c == 1) sum = "1" + sum;
        return sum;
    }
}
