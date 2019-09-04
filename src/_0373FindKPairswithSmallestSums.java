import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class _0373FindKPairswithSmallestSums {
    public List<List<Integer>> kSmallestPairs(int[] nums1, int[] nums2, int k) {
    	List<List<Integer>> nums = new ArrayList<>();
    	for (int n1 : nums1) {
    		for (int n2 : nums2) {
    			nums.add(Arrays.asList(n1, n2));
    		}
    	}
    	nums.sort(new Comparator<List<Integer>>() {
    		@Override
			public int compare(List<Integer> o1, List<Integer> o2) {
    			int sum1 = o1.get(0) + o1.get(1);
    			int sum2 = o2.get(0) + o2.get(1);
    			return sum1 - sum2;
    		}
		});
        return nums.subList(0, nums.size() < k ? nums.size() : k);
    }
}
