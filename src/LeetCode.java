import java.util.List;

public class LeetCode {
	public static void main(String[] args){
		_97InterleavingString test = new _97InterleavingString();
		String s1 = "aabcc";
		String s2 = "dbbca";
		String s3 = "aadbbbaccc";
		boolean result = test.isInterleave(s1, s2, s3);
		System.out.println(result);
		
	}
}