import java.util.ArrayList;
import java.util.List;

public class _089GrayCode {
    public List<Integer> grayCode(int n) {
        List<Integer> list = new ArrayList<Integer>();
        list.add(0);
        for (int i = 1; i <= n; i++) {
        	List<Integer> newList = new ArrayList<Integer>();
        	int bit = 1 << (i - 1);
        	for (int num : list) newList.add(0, bit + num);
        	list.addAll(newList);
        }
        return list;
    }
}
