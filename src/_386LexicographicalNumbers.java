import java.util.ArrayList;
import java.util.List;

public class _386LexicographicalNumbers {
    public List<Integer> lexicalOrder(int n) {
        List<Integer> list = new ArrayList<Integer>();
        int num = 1;
        for (int i = 1; i <= n; i++) {
        	list.add(num);
        	if (num * 10 <= n) num *= 10;
        	else if (num + 1 <= n && num % 10 < 9) num++;
        	else {
        		while ((num / 10 % 10) == 9) num /= 10;
        		num = num / 10 + 1;
        	}
        }
        return list;
    }
}
