import java.util.HashSet;
import java.util.Set;

public class _349IntersectionOfTwoArrays {
	public int[] intersection(int[] nums1, int[] nums2) {
        if (nums1 == null || nums2 == null) return null;
        Set<Integer> set1 = new HashSet<Integer>();
        Set<Integer> set2 = new HashSet<Integer>();
        for (int i = 0; i < nums1.length; i++) set1.add(nums1[i]);
        for (int i = 0; i < nums2.length; i++) if (set1.contains(nums2[i])) set2.add(nums2[i]);
        int l = set2.size();
        int[] r = new int[l];
        int count = 0;
        for (int i : set2) r[count++] = i;
        return r;
	}
}
