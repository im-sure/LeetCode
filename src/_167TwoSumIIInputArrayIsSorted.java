
public class _167TwoSumIIInputArrayIsSorted {
    public int[] twoSum(int[] numbers, int target) {
        int l = numbers.length;
        int pre = 0;
        boolean isNotFirst = false;
        for (int i = 0; i < l; i++) {
        	if (numbers[i] == pre && isNotFirst) continue;
        	isNotFirst = true;
        	int diff = target - numbers[i];
	    	for (int j = i + 1; j < l; j++) {
	    		if (numbers[j] == diff) return new int[]{i + 1, j + 1};
	    		else if (numbers[j] > diff) break;
	    	}
	    	pre = numbers[i];
        }
        return new int[2];
    }
}
