import java.util.ArrayList;
import java.util.List;

public class _438FindAllAnagramsInAString {
    public List<Integer> findAnagrams(String s, String p) {
        int[] a = new int[26];
        for (int i = 0; i < p.length(); i++) {
        	if (a[p.charAt(i) - 'a'] == 0) a[p.charAt(i) - 'a'] = 1;
        	a[p.charAt(i) - 'a']++;
        }
        int count = 0;
        int [] b = (int[])a.clone();
        List<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < s.length(); i++) {
        	if (b[s.charAt(i) - 'a'] == 0) {
        		count = 0;
        		b = (int[])a.clone();
        	} else if (b[s.charAt(i) - 'a'] == 1) {
        		if (!(count != 0 && s.charAt(i) == s.charAt(i - count))) {
	        		i -= (count - 1);
	        		b = (int[])a.clone();
	        		count = 0;
        		}
        	} else {
        		b[s.charAt(i) - 'a']--;
        		count++;
        	}
        	if (count == p.length()) {
        		list.add(i - count + 1);
        	}
        }
        return list;
    }
}
