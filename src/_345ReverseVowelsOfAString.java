import java.util.HashSet;
import java.util.Set;

public class _345ReverseVowelsOfAString {
    public String reverseVowels(String s) {
    	Set<Character> set = new HashSet<Character>();
    	set.add('a');
    	set.add('e');
    	set.add('i');
    	set.add('o');
    	set.add('u');
    	set.add('A');
    	set.add('E');
    	set.add('I');
    	set.add('O');
    	set.add('U');
        StringBuilder sb = new StringBuilder(s);
        int start = 0;
        int end = s.length() - 1;
        boolean fromStart = true;
        while (start < end) {
        	if (fromStart) {
        		if (set.contains(s.charAt(start))) fromStart = false;
        		else start++;
        	} else if (set.contains(s.charAt(end))) {
        		sb.replace(start, start + 1, String.valueOf(s.charAt(end)));
				sb.replace(end, end + 1, String.valueOf(s.charAt(start)));
				start++;
				end--;
				fromStart = true;
        	} else end--;
        }
        return sb.toString();
    }
}
