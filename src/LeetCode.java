import java.util.List;

public class LeetCode {
	public static void main(String[] args){
		_349IntersectionOfTwoArrays test = new _349IntersectionOfTwoArrays();
		int[] a = {5,1,7,3};
		int[] b = {3,5};
		int[] result = test.intersection(a, b);
		for (int i : result)
			System.out.println(i);
	}
}