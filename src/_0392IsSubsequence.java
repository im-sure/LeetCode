
public class _0392IsSubsequence {
    public boolean isSubsequence(String s, String t) {
        int ls = s.length();
        int lt = t.length();
        if (ls > lt) return false;
        int iS = 0;
        int iT = 0;
        while (iS < ls) {
        	if (iT == lt || ls - iS > lt - iT) return false;
        	if (s.charAt(iS) == t.charAt(iT)) {
        		iS++;
        		iT++;
        	} else iT++;
        }
        return true;
    }
}
