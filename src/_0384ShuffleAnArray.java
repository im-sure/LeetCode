import java.util.Random;

public class _0384ShuffleAnArray {
	int[] nums;
	Random random;
	
    public _0384ShuffleAnArray(int[] nums) {
        this.nums = nums;
        random = new Random();
    }
    
    public int[] reset() {
        return nums;
    }
    
    public int[] shuffle() {
    	int l = nums.length;
    	int[] r = nums.clone();
        for (int i = 0; i < l; i++) {
        	int n = random.nextInt(l - i);
        	int tmp = r[i];
        	r[i] = r[i + n];
        	r[i + n] = tmp;
        }
        return r;
    }
}
