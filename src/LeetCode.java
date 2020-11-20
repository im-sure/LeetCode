import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class LeetCode {
	public static void main(String[] args) {
    _0031NextPermutation test = new _0031NextPermutation();
    int[] nums = {1, 2, 4, 6, 5, 3, 1};
    test.nextPermutation(nums);
		System.out.println(Arrays.toString(nums));
	}
}