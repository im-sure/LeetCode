
public class _0278FirstBadVersion {
    public int firstBadVersion(int n) {
    	int h = n;
    	int l = 0;
    	int r = h + (l - h) / 2;
        while (h - l > 1) {
        	if (isBadVersion(r)) h = r;
        	else l = r;
        	r = h + (l - h) / 2;
        }
        return r;
    }
}
