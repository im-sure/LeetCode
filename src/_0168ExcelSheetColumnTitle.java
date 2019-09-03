
public class _0168ExcelSheetColumnTitle {
    public String convertToTitle(int n) {
        StringBuilder sb = new StringBuilder();
        do {
        	n -= 1;
        	sb.append((char)(n % 26 + 'A'));
        	n /= 26;
        } while (n != 0);
        return sb.reverse().toString();
    }
}
