
public class _088MergeSortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if (m == 0) {
        	for (int i = 0; i < n; i++) nums1[i] = nums2[i];
        	return;
        } else if (n == 0) return;
        int index = 0;
        int count = 0;
        for (int i = 0; i < m + n; i++) {
        	while (index < n && nums2[index] <= nums1[i]) {
        		index++;
        		count++;
        	}
        	if (count != 0) {
        		for (int j = m + n - 1; j >= i + count; j--) nums1[j] = nums1[j - count];
        		for (int j = index - count; j < index; j++) nums1[i++] = nums2[j];
            	count = 0;
        	}
        	if (i == m + index) {
        		for (int j = i; j < m + n; j++) nums1[j] = nums2[index++];
        		return;
        	}
        }
    }
}
