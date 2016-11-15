
public class _066PlusOne {
    public int[] plusOne(int[] digits) {
        int c = 0;
    	for (int i = digits.length - 1; i >= 0; i--) {
    		if (i == digits.length - 1) digits[i]++;
    		else {
    			digits[i] += c;
    			c = 0;
    		}
    		if (digits[i] == 10) {
    			digits[i] = 0;
    			c = 1;
    		}
    	}
    	if (c == 1) {
    		int[] newDigits = new int[digits.length + 1];
    		newDigits[0] = 1;
    		for (int i = 0; i < digits.length; i++) newDigits[i + 1] = digits[i];
    		return newDigits;
    	}
    	return digits;
    }
}
