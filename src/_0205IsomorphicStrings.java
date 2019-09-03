import java.util.HashMap;
import java.util.Map;

public class _0205IsomorphicStrings {
    public boolean isIsomorphic(String s, String t) {
        if (s.length() == 0) return true;
        Map<Character, Character> map = new HashMap<Character, Character>();
        for (int i = 0; i < s.length(); i++) {
        	char cs = s.charAt(i);
        	char ct = t.charAt(i);
        	if (map.containsKey(cs)) {
        		if (map.get(cs) != ct) return false;
        	} else if (map.containsValue(ct)) return false;
        	else map.put(cs, ct);
        }
        return true;
    }
}
