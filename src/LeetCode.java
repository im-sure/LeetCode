import java.util.List;

public class LeetCode {
	public static void main(String[] args){
		_405ConvertANumberToHexadecimal test = new _405ConvertANumberToHexadecimal();
		int a = -2147483648;
		int b = -111110;
		String result = test.toHex(a);
		System.out.println(result);
	}
}