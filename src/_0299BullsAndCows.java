
public class _0299BullsAndCows {
    public String getHint(String secret, String guess) {
        int[] sdigits = new int[10];
        int[] gdigits = new int[10];
        int bulls = 0;
        int cows = 0;
        int l = secret.length();
		for (int i = 0; i < l; i++) sdigits[secret.charAt(i) - '0']++;
        for (int i = 0; i < l; i++) {
        	if (secret.charAt(i) == guess.charAt(i)) {
        		sdigits[guess.charAt(i) - '0']--;
        		bulls++;
        	}
        	else if (sdigits[guess.charAt(i) - '0'] > 0 ) {
        		gdigits[guess.charAt(i) - '0']++;
        	}
        }
        for (int i = 0; i < 10; i++) {
        	if (gdigits[i] > 0) {
        		if (gdigits[i] < sdigits[i])
        			cows += gdigits[i];
        		else cows += sdigits[i];
        	}
        }
        return bulls + "A" + cows + "B";
    }
}
