import java.util.List;

public class LeetCode {
	public static void main(String[] args){
		_383RansomNote test = new _383RansomNote();
		String a = "bjaajgea";
		String b = "affhiiicabhbdchbidghccijjbfjfhjeddgggbajhidhjchiedhdibgeaecffbbbefiabjdhggihccec";
		boolean result = test.canConstruct(a, b);
		System.out.println(result);
	}
}