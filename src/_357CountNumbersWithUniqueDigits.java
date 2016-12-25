
public class _357CountNumbersWithUniqueDigits {
    public int countNumbersWithUniqueDigits(int n) {
        if (n > 10) n = 10;
        if (n == 0) return 1;
        else if (n == 1) return 10;
        int nums = 10;
        for (int i = 1; i < n; i++) {
        	int num = 9;
        	for (int j = 9; j >= 10 - i; j--) num *= j;
        	nums += num;
        }
        return nums;
    }
}
