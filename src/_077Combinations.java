import java.util.ArrayList;
import java.util.List;

public class _077Combinations {
    public List<List<Integer>> combine(int n, int k) {
        return combine(1, n, k);
    }
    
    public List<List<Integer>> combine(int s, int n, int k) {
    	List<List<Integer>> list = new ArrayList<List<Integer>>();
    	if (k == 1) {
	    	for (int i = s; i <= n; i++) {
	        	List<Integer> l = new ArrayList<Integer>();
	        	l.add(i);
	    		list.add(l);
	    	}
    	} else {
    		list = combine(s + 1, n, k - 1);
    		for (List<Integer> l : list) l.add(s);
    		if ((n - s) >= k) {
	    		List<List<Integer>> tmp = combine(s + 1, n, k);
	    		for (List<Integer> l : tmp) list.add(l);
    		}
    	}
    	return list;
    }
}
