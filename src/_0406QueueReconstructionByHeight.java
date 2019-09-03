
public class _0406QueueReconstructionByHeight {
    public int[][] reconstructQueue(int[][] people) {
    	int l = people.length;
    	if (l == 1) return people;
    	for (int i = l - 1; i > 0; i--) {
    		for (int j = 0; j < i; j++) {
    			if (people[i][1] < people[j][1]) {
    				int[] tmp = people[i];
    				people[i] = people[j];
    				people[j] = tmp;
    			} else if (people[i][1] == people[j][1] && people[i][0] < people[j][0]) {
    				int[] tmp = people[i];
    				people[i] = people[j];
    				people[j] = tmp;
    			}
    		}
    	}
        for (int i = 1; i < l; i++) {
        	int count = 0;
        	for (int j = 0; j < i; j++) {
	        	if (people[i][0] <= people[j][0]) count++;
	        	if (people[i][1] < count) {
	        		int[] tmp = people[i];
	        		for (int k = i; k >= j + 1; k--) people[k] = people[k - 1];
	        		people[j] = tmp;
	            	break;
	        	}
        	}
        }
        return people;
    }
}
