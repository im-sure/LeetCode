import java.util.HashMap;
import java.util.Map;

public class _387FirstUniqueCharacterInAString {
    public int firstUniqChar(String s) {
        char[] c = s.toCharArray();
        Map<Character, Integer> map = new HashMap<Character, Integer>();
        for (int i =0; i < c.length; i++) {
        	if (!map.containsKey(c[i])) map.put(c[i], i);
        	else if (map.containsKey(c[i])) map.replace(c[i], -1);
        }
        if (map.isEmpty()) return -1;
        else {
        	for (int i =0; i < c.length; i++) {
        		if (map.containsValue(i)) return i;
        	}
        	return -1;
        }
    }
}
