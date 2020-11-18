public class _0004MedianOfTwoSortedArrays {
  public double findMedianSortedArrays(int[] nums1, int[] nums2) {
    int m = nums1.length;
    int n = nums2.length;
    int left = (m + n + 1) / 2;
    int right = (m + n + 2) / 2;
    return (getK(nums1, nums2, 0, 0, left) + getK(nums1, nums2, 0, 0, right)) / 2;
  }

  private double getK(int[] nums1, int[] nums2, int i, int j, int k) {
    if (i >= nums1.length) {
      return nums2[j + k - 1];
    }
    if (j >= nums2.length) {
      return nums1[i + k - 1];
    }
    if (k == 1) {
      return Math.min(nums1[i], nums2[j]);
    }
    int val1 = i + k / 2 - 1 < nums1.length ? nums1[i + k / 2 - 1] : Integer.MAX_VALUE;
    int val2 = j + k / 2 - 1 < nums2.length ? nums2[j + k / 2 - 1] : Integer.MAX_VALUE;
    if (val1 < val2) {
      return getK(nums1, nums2, i + k / 2, j, k - k / 2);
    } else {
      return getK(nums1, nums2, i, j + k / 2, k - k / 2);
    }
  }
}
