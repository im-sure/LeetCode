
public class _97InterleavingString {
	public boolean isInterleave(String s1, String s2, String s3) {
		if (s3.length() != s1.length() + s2.length()) return false;
	    boolean[][] table = new boolean[s1.length() + 1][s2.length() + 1];
	    char[] c1 = s1.toCharArray();
	    char[] c2 = s2.toCharArray();
	    char[] c3 = s3.toCharArray();
	    for (int i = 0; i < s1.length() + 1; i++)
	        for (int j = 0; j < s2.length() + 1; j++){
	            if (i == 0 && j == 0) 
	            	table[i][j] = true;
	            else if (i == 0)
	                table[i][j] = (table[i][j - 1] && c2[j - 1] == c3[i + j - 1]);
	            else if(j == 0)
	                table[i][j] = (table[i - 1][j] && c1[i - 1] == c3[i + j - 1]);
	            else
	                table[i][j] = (table[i - 1][j] && c1[i - 1] == c3[i + j - 1]) 
	                		|| (table[i][j - 1] && c2[j - 1] == c3[i + j - 1]);
	        }
	        
	    return table[s1.length()][s2.length()];
    }
}
