import java.util.Arrays;

public class _383RansomNote {
	public boolean canConstruct(String ransomNote, String magazine) {
        char[] r = ransomNote.toCharArray();
        char[] m = magazine.toCharArray();
        int rl = r.length;
		int ml = m.length;
		if (rl > ml) return false;
		else if (rl == 0) return true;
		Arrays.sort(r);
		Arrays.sort(m);
		int count = 0;
        for (int i = 0; i < ml; i++) {
        	if (r[count] == m[i]) count++;
            if (count == rl) return true;
        }
        return false;
    }
}
