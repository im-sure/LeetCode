
public class _0009PalindromeNumber {
    public boolean isPalindrome(int x) {
        if (x < 0) return false;
        int l = String.valueOf(x).length();
		System.out.println(l);
        for (int i = 0; i < l / 2; i++) {
        	if (x % (int)Math.pow(10, i + 1) / (int)Math.pow(10, i) !=
        			x / (int)Math.pow(10, l - i - 1) % (int)Math.pow(10, 1))
        		return false;
        }
        return true;
    }
}
