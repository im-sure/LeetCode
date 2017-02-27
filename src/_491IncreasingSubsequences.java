import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class _491IncreasingSubsequences {
    public List<List<Integer>> findSubsequences(int[] nums) {
        Set<List<Integer>> list = new HashSet<List<Integer>>();
        for (int i = 0; i < nums.length - 1; i++) {
        	List<List<Integer>> tmp = new ArrayList<List<Integer>>();
        	List<Integer> firstList = new ArrayList<Integer>();
        	firstList.add(nums[i]);
        	tmp.add(firstList);
        	for (int j = i + 1; j < nums.length; j++) {
        		List<List<Integer>> t = new ArrayList<List<Integer>>();
        		for (List<Integer> tmpList : tmp) {
        			List<Integer> ll = new ArrayList<Integer>();
        			ll.addAll(tmpList);
        			if (ll.get(ll.size() - 1) <= nums[j] && (nums[j] != nums[j - 1] || ll.contains(nums[j]))) {
        				ll.add(nums[j]);
            			t.add(ll);
        			}
        		}
        		for (List<Integer> tmpList : t) tmp.add(tmpList);
        	}
        	if (tmp.size() > 1) {
	        	tmp.remove(0);
	        	for (List<Integer> tmpList : tmp) list.add(tmpList);
        	}
        }
        return new ArrayList(list);
    }
}
