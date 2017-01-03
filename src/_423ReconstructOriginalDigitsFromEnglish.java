
public class _423ReconstructOriginalDigitsFromEnglish {
    public String originalDigits(String s) {
        int[] digits = new int[10];
        for (int i = 0; i < s.length(); i++) {
        	switch(s.charAt(i)) {
        	case 'z': digits[0]++; break;
        	case 'x': digits[6]++; break;
        	case 's': digits[7]++; break; //7-6
        	case 'v': digits[5]++; break; //5-7
        	case 'g': digits[8]++; break;
        	case 'i': digits[9]++; break; //9-5-6-8
        	case 'h': digits[3]++; break; //3-8
        	case 'u': digits[4]++; break; 
        	case 'w': digits[2]++; break;
        	case 'o': digits[1]++; break; //1-0-2-4
        	default: break;
        	}
        }
        digits[7] -= digits[6];
        digits[5] -= digits[7];
        digits[3] -= digits[8];
        digits[9] -= digits[5] + digits[6] + digits[8];
        digits[1] -= digits[0] + digits[2] + digits[4];
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 10; i++) {
        	for (int j = 0; j < digits[i]; j++) {
        		sb.append(i);
        	}
        }
        return sb.toString();
    }
}
