
public class _058LengthOfLastWord {
    public int lengthOfLastWord(String s) {
        if (s.length() == 0) return 0;
        String[] str = s.split(" ");
        return str.length == 0 ? 0 : str[str.length - 1].length();
    }
}
