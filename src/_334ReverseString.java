
public class _334ReverseString {
	public String reverseString(String s) {
		char tmp[] = s.toCharArray();
		int l = tmp.length;
		for (int i = 0; i < l / 2; i++) {
			char t = tmp[l - i - 1];
			tmp[l - i - 1] = tmp[i];
			tmp[i] = t;
		}
		return String.valueOf(tmp);
	}
}
