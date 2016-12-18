import java.util.List;

public class LeetCode {
	public static void main(String[] args) {
		_260SingleNumberIII test = new _260SingleNumberIII();
		int[] a = {1,2,1,3,2,5};
		int[] result = test.singleNumber(a);
		System.out.println(result[0] + " " + result[1]);
	}
}