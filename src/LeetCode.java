import java.util.List;

public class LeetCode {
	public static void main(String[] args){
		_401BinaryWatch test = new _401BinaryWatch();
		List<String> result = test.readBinaryWatch(1);
		for (int i = 0; i < result.size(); i++)
			System.out.println(result.get(i));
	}
}