
public class _409LongestPalindrome {
    public int longestPalindrome(String s) {
        int[] c = new int[52];
        for (int i = 0; i < s.length(); i++) {
        	if (s.charAt(i) <= 'Z') c[s.charAt(i) - 'A']++;
        	else c[s.charAt(i) - 'a' + 26]++;
        }
        boolean l = false;
        int r = 0;
        for (int i = 0; i < 52; i++) {
        	if (!l && c[i] % 2 == 1) l = true;
        	r += c[i] / 2 * 2;
        }
        return l ? r + 1 : r; 
    }
}
