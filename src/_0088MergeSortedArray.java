
public class _0088MergeSortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        while (m != 0 || n != 0) nums1[m + n - 1]
        		= (m != 0 ? nums1[m - 1] : Integer.MIN_VALUE)
        		> (n != 0 ? nums2[n - 1] : Integer.MIN_VALUE)
        		? nums1[--m] : nums2[--n];
    }
}
