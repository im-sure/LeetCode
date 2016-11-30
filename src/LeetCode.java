import java.util.List;

public class LeetCode {
	public static void main(String[] args) {
		_088MergeSortedArray test = new _088MergeSortedArray();
		int[] a = {0,1,2,2,3,4,5,6,6,8,0,0,0,0,0,0,0};
		int b = 10;
		int[] c = {2,3,3,4,7,8,9};
		int d = 7;
		test.merge(a, b, c, d);
		//System.out.println(a);
	}
}