import java.util.List;

public class LeetCode {
	public static void main(String[] args){
		_350IntersectionOfTwoArraysII test = new _350IntersectionOfTwoArraysII();
		int[] a = {1,2,2,1};
		int[] b = {1,1};
		int[] result = test.intersect(a, b);
		for (int i = 0; i < result.length; i++)
			System.out.println(result[i]);
	}
}