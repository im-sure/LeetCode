import java.util.Arrays;

public class _0462MinimumMovesToEqualArrayElementsII {
    public int minMoves2(int[] nums) {
        Arrays.sort(nums);
        int l = nums.length;
        int median = nums[l / 2];
        int moves = 0;
    	for (int i = 0; i < l; i++) moves += (int)Math.abs(nums[i] - median);
    	return moves;
    }
}
