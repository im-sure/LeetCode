import java.util.List;

public class LeetCode {
	public static void main(String[] args) {
		_347TopKFrequentElements test = new _347TopKFrequentElements();
		int[] a = {1};
		List<Integer>  result = test.topKFrequent(a, 1);
		for (int i : result) System.out.println(i);
	}
}