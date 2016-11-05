import java.util.ArrayList;
import java.util.List;

public class _202HappyNumber {
	public boolean isHappy(int n) {
        List<Integer> list = new ArrayList<Integer>();
        while (!list.contains(n)) {
        	 list.add(n);
        	int tmp = 0;
        	for (int i = 0; i < String.valueOf(n).length(); i++)
        		tmp += Math.pow((n / (int)Math.pow(10, i) % 10), 2);
    		n = tmp;
        	if (n == 1) return true;
        }
        return false;
    }
}
