import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class _022GenerateParentheses {
    public List<String> generateParenthesis(int n) {
    	List<String> list = new ArrayList<String>();
    	Map<String, Integer> map = new HashMap<String, Integer>();
    	map.put("", 0);
    	for (int i = 0; i < n * 2; i++) {
        	Map<String, Integer> tmp = new HashMap<String, Integer>();
        	for (String e : map.keySet()) {
        		int val = map.get(e);
        		if (val == 0) tmp.put(e + "(", 1);
        		else if (i < n || (i >= n && val < (n * 2 - i + val) / 2)) {
        			tmp.put(e + "(", val + 1);
        			tmp.put(e + ")", val - 1);
        		} else tmp.put(e + ")", val - 1);
        	}
        	map = tmp;
    	}
    	list.addAll(map.keySet());
    	return list;
    }
}
