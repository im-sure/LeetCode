
public class _290WordPattern {
    public boolean wordPattern(String pattern, String str) {
        String[] p = new String[26];
        String[] s = str.split(" ");
        if (pattern.length() != s.length) return false;
        for (int i = 0; i < pattern.length(); i++) {
        	int c = pattern.charAt(i) - 'a';
        	if (p[c] == null) {
        		for (int j = 0; j < 26; j++) 
        			if (j != c && p[j] != null && p[j].equals(s[i])) return false;
        		p[c] = s[i];
        	}
        	else if (!p[c].equals(s[i])) return false;
        }
        return true;
    }
}
