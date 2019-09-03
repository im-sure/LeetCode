
public class _0038CountAndSay {
    public String countAndSay(int n) {
        String oldSeq = "1";
        if (n == 1) return oldSeq;
        for (int i = 1; i < n; i++) {
            String newSeq = "";
            int l = oldSeq.length();
        	for (int j = 0; j < l; j++) {
        		char c = oldSeq.charAt(j);
	        	int num = 1;
        		while (++j < l && oldSeq.charAt(j) == c) num++;
        		j--;
        		newSeq += num + String.valueOf(c);
        	}
        	oldSeq = newSeq;
        }
        return oldSeq;
    }
}
