import java.util.List;

public class LeetCode {
	public static void main(String[] args) {
		_299BullsAndCows test = new _299BullsAndCows();
		String a = "00112233445566778899";
		String b = "16872590340158679432";
		String result = test.getHint(a, b);
		System.out.println(result);
	}
}