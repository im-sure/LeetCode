import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class LeetCode {
	public static void main(String[] args) {
		_011ContainerWithMostWater test = new _011ContainerWithMostWater();
		int[] a = {2,3,4,5,18,17,6};
		int result = test.maxArea(a);
		System.out.println(result);
	}
}