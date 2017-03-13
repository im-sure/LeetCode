import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _039CombinationSum {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
    	Arrays.sort(candidates);
        return combine(candidates, 0, target);
    }
    
    public List<List<Integer>> combine(int[] candidates, int s, int k) {
    	List<List<Integer>> list = new ArrayList<List<Integer>>();
    	for (; s < candidates.length; s++) {
    		if (k < candidates[s]) break;
    		else if (k == candidates[s]) {
    			List<Integer> tmpList = new ArrayList<Integer>();
    			tmpList.add(k);
    			list.add(tmpList);
    			break;
    		}
    		else {
    			List<List<Integer>> tmp = combine(candidates, s, k - candidates[s]);
    			if (tmp != null) {
    				for (List<Integer> l : tmp) {
    					l.add(candidates[s]);
    					list.add(l);
    				}
    			}
    		}
    	}
    	return list;
    }
}
