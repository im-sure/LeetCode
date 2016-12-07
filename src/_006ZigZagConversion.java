import java.util.ArrayList;
import java.util.List;

public class _006ZigZagConversion {
    public String convert(String s, int numRows) {
    	if (s.length() == 0) return "";
        int count = 0;
        boolean reverse = false;
        List<List<Character>> rows = new ArrayList<List<Character>>();
        for (int i = 0; i < numRows; i++) rows.add(new ArrayList<Character>());
        for (char c : s.toCharArray()) {
        	rows.get(count).add(c);
        	count = reverse ? (count - 1 < 0 ? 0 : count - 1) : (count + 1 < numRows ? count + 1 : numRows - 1);
        	reverse = count == 0 ? false : (count == numRows - 1 ? true : reverse);
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < numRows; i++) {
        	List<Character> list = rows.get(i);
        	for (int j = 0; j < list.size(); j++) sb.append(list.get(j));
        }
        return sb.toString();
    }
}
