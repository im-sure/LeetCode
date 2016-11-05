import java.util.ArrayList;
import java.util.List;

public class _202HappyNumber {
	public boolean isHappy(int n) {
        List<Integer> list = new ArrayList<Integer>();
        while (!list.contains(n)) {
        	list.add(n);
        	int tmp = 0;
        	int l = String.valueOf(n).length();
        	for (int i = 0; i < l; i++){
        		tmp += Math.pow(n % 10, 2);
        		n = n / 10;
        	}
    		n = tmp;
        	if (n == 1) return true;
        }
        return false;
    }
}
