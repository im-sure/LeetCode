import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _0350IntersectionOfTwoArraysII {
	public int[] intersect(int[] nums1, int[] nums2) {
        if (nums1.length == 0 || nums2.length == 0) return new int[0];
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        List<Integer> r = new ArrayList<Integer>();
        int i = 0, j = 0;
        while(i != nums1.length && j != nums2.length) {
        	if (nums1[i] == nums2[j]) {
        		r.add(nums1[i]);
        		i++;
        		j++;
        	} else if (nums1[i] < nums2[j]) i++;
        	else j++;
        }
        if (r.isEmpty()) return new int[0];
        else {
        	int[] result = new int[r.size()];
        	for (int h = 0; h < r.size(); h++) {
        		result[h] = r.get(h);
        	}
            return result;
        }
    }
}
