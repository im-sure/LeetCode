import java.util.ArrayList;
import java.util.List;

public class _0401BinaryWatch {
	public List<String> readBinaryWatch(int num) {
        List<String> r = new ArrayList<String>();
        if (num == 0) {
        	r.add("0:00");
        	return r;
        } else if (num > 10) return null;
        for (int i = (num > 6 ? num - 6 : 0); i <= (num < 4 ? num : 4); i++) {
        	for (int j = 0; j < 12; j++) {
        		for (int h = 0; h < 60; h++) {
        			if (Integer.bitCount(j) != i) break;
        			else if (Integer.bitCount(h) != num - i) continue;
        			r.add(String.valueOf(j) + ":" + (h < 10 ? "0" + String.valueOf(h) : String.valueOf(h)));
        		}
        	}
        }
        return r;
    }
}
