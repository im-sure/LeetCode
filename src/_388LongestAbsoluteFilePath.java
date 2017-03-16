import java.util.ArrayList;
import java.util.List;

public class _388LongestAbsoluteFilePath {
    public int lengthLongestPath(String input) {
        if (input == null || input.length() == 0 || input.startsWith("\\")) return 0;
        List<Integer> list = new ArrayList<Integer>();
        int max = 0;
        int level = 0;
        int s = 0;
        boolean isFile = false;
        for (int i = 0; i < input.length(); i++) {
        	if (input.charAt(i) == '\n') {
        		for (int j = list.size() - 1; j >= level; j--) list.remove(j);
        		list.add(i - s);
        		if (isFile) {
        			int tmp = 0;
        			for (int len : list) tmp += len;
        			tmp += level;
        			max = Math.max(max, tmp);
        			isFile = false;
        		}
        		level = 0;
        		while (input.charAt(++i) == '\t') level++;
        		s = i;
        	} else if (input.charAt(i) == '.') isFile = true;
        }
		if (isFile) {
	        for (int j = list.size() - 1; j >= level; j--) list.remove(j);
			list.add(input.length() - s);
			int tmp = 0;
			for (int len : list) tmp += len;
			tmp += level;
			max = Math.max(max, tmp);
			isFile = false;
		}
        return max;
    }
}
