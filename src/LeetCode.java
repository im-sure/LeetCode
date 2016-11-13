import java.util.List;

public class LeetCode {
	public static void main(String[] args){
		_438FindAllAnagramsInAString test = new _438FindAllAnagramsInAString();
		String a = "cbaebabacd";
		String b = "abc";
//		String a = "abab";
//		String b = "ab";
		List<Integer> result = test.findAnagrams(a, b);
		System.out.println(result.toString());
	}
}