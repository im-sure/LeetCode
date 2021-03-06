
public class _0303RangeSumQuery_Immutable {
	int[] sums;
	
    public _0303RangeSumQuery_Immutable(int[] nums) {
        sums = new int[nums.length + 1];
    	for (int i = 1; i <= nums.length; i++) sums[i] += sums[i - 1] + nums[i - 1];
    }

    public int sumRange(int i, int j) {
        return sums[j + 1] - sums[i];
    }
}
