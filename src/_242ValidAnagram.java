import java.util.HashMap;
import java.util.Map;

public class _242ValidAnagram {
    public boolean isAnagram(String s, String t) {
        if (s == "" && t == "") return true;
        else if (s.length() != t.length()) return false;
        Map<Character, Integer> map = new HashMap<Character, Integer>();
        for (char c : s.toCharArray()) {
        	if (!map.containsKey(c)) map.put(c, 1);
        	else map.replace(c, map.get(c) + 1);
        }
        for (char c : t.toCharArray()) {
        	if (!map.containsKey(c)) return false;
        	else if (map.get(c) == 1) map.remove(c);
        	else map.replace(c, map.get(c) - 1);
        }
        if (map.isEmpty()) return true;
        else return false;
    }
}
