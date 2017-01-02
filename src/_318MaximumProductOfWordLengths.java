
public class _318MaximumProductOfWordLengths {
    public int maxProduct(String[] words) {
        int max = 0;
        int l = words.length;
        int[] values = new int[l];
        for (int i = 0; i < l; i++) {
        	String word = words[i];
        	for (int j = 0; j < word.length(); j++) values[i] |= 1 << (word.charAt(j) - 'a');
        }
        for (int i = 0; i < l - 1; i++) {
        	for (int j = i + 1; j < l; j++) {
        		if ((values[i] & values[j]) == 0) {
        			int len = words[i].length() * words[j].length();
        			if (len > max) max = len;
        		}
        	}
        }
        return max;
    }
}
