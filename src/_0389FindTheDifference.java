
public class _0389FindTheDifference {
	public char findTheDifference(String s, String t) {
        char[] sToChars = s.toCharArray();
        char[] tToChars = t.toCharArray();
        char r = '\0';
        for (int i = 0; i < sToChars.length; i++) r = (char)(r ^ sToChars[i]);
        for (int i = 0; i < tToChars.length; i++) r = (char)(r ^ tToChars[i]);
        return r;
    }
}
