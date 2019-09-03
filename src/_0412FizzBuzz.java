import java.util.ArrayList;
import java.util.List;

public class _0412FizzBuzz {
	public List<String> fizzBuzz(int n) {
        List<String> numList = new ArrayList<String>();
		for (int i = 1; i <= n; i++) {
			if ((i % 15) == 0) numList.add("FizzBuzz");
			else if ((i % 3) == 0) numList.add("Fizz");
			else if ((i % 5) == 0) numList.add("Buzz");
			else numList.add(String.valueOf(i));
		}
		return numList;
    }
}
