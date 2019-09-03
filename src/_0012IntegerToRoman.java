
public class _0012IntegerToRoman {
    public String intToRoman(int num) {
        StringBuilder sb = new StringBuilder();
        char[] ones = {'I', 'X', 'C', 'M'};
        char[] fives = {'V', 'L', 'D'};
        int level = 0;
        while (num != 0) {
        	int digit = num % 10;
        	if (digit < 4) {
        		for (int i = 0; i < digit; i++) sb.append(ones[level]);
        	} else if (digit == 4) sb.append(fives[level]).append(ones[level]);
        	else if (digit < 9) {
        		for(int i = 0; i < digit - 5; i++) sb.append(ones[level]);
        		sb.append(fives[level]);
        	} else sb.append(ones[level + 1]).append(ones[level]);
        	num /= 10;
        	level++;
        }
        return sb.reverse().toString();
    }
}
