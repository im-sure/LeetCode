
public class _125ValidPalindrome {
    public boolean isPalindrome(String s) {
        if (s.length() == 0) return true;
    	s = s.toLowerCase();
    	int ifront = 0;
    	int iback = s.length() - 1;
        while (ifront < iback) {
        	char cfront = s.charAt(ifront);
        	char cback = s.charAt(iback);
        	if (!((cfront >= 'a' && cfront <= 'z') || (cfront >= '0' && cfront <= '9'))) ifront++;
        	else if (!((cback >= 'a' && cback <= 'z') || (cback >= '0' && cback <= '9'))) iback--;
        	else if (cfront != cback) return false;
        	else {
        		ifront++;
        		iback--;
        	}
        }
        return true;
    }
}
