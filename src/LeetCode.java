import java.util.List;

public class LeetCode {
	public static void main(String[] args){
		_066PlusOne test = new _066PlusOne();
		int[] a = {9,5,1};
		int[] result = test.plusOne(a);
		for (int i = 0; i < result.length; i++)
			System.out.print(result[i]);
	}
}