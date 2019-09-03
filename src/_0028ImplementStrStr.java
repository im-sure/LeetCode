
public class _0028ImplementStrStr {
    public int strStr(String haystack, String needle) {
        int lh = haystack.length();
		int ln = needle.length();
        if (lh < ln) return -1;
        for (int i = 0; i <= lh - ln; i++) {
        	if (haystack.substring(i, i + ln).equals(needle)) return i;
        }
        return -1;
    }
}
