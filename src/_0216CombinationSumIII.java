import java.util.ArrayList;
import java.util.List;

public class _0216CombinationSumIII {
    public List<List<Integer>> combinationSum3(int k, int n) {
    	return findNum(k, 1, n);
    }
    
    private List<List<Integer>> findNum(int k, int start, int n) {
    	if (start > n) return null;
    	List<List<Integer>> list = new ArrayList<List<Integer>>();
    	if (k > 1) {
    		for (int i = start; i < 10; i++) {
				List<List<Integer>> nextList = findNum(k - 1, i + 1, n - i);
				if (nextList == null) continue;
				else {
					for (List<Integer> l : nextList) l.add(i);
					list.addAll(nextList);
				}
    		}
		} else {
			if (n >= start && n < 10) {
				List<Integer> newList = new ArrayList<Integer>();
				newList.add(n);
				list.add(newList);
			} else return null;
		}
    	return list;
    }
}
