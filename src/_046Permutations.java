import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class _046Permutations {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> list = new ArrayList<List<Integer>>();
        int len = nums.length;
        if (len == 1) {
        	List<Integer> l = new ArrayList<Integer>();
        	l.add(nums[0]);
        	list.add(l);
        	return list;
        }
        Set<Integer> set = new HashSet<Integer>();
        for (int i = 0; i < len; i++) set.add(nums[i]);
        for (int i = 0; i < len; i++) {
        	int num = nums[i];
        	set.remove(num);
        	int[] subNums = new int[len - 1];
        	int j = 0;
        	for (int n : set) subNums[j++] = n;
        	List<List<Integer>> subList = permute(subNums);
        	for (List<Integer> l : subList) l.add(num);
        	list.addAll(subList);
        	set.add(num);
        }
        return list;
    }
}
