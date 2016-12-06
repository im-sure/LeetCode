
public class _414ThirdMaximumNumber {
    public int thirdMax(int[] nums) {
        int[] max = new int[3];
        max[0] = nums[0];
        int count = 1;
        for (int i = 1; i < nums.length; i++) {
            boolean exist = false;
        	for (int j = 0; j < count; j++) {
        		if (nums[i] == max[j]) {
        			exist = true;
        			break;
        		}
        	}
        	if (!exist) {
        		if (nums[i] > max[0]) {
        			max[2] = max[1];
        			max[1] = max[0];
        			max[0] = nums[i];
        			count = ++count == 4 ? 3 : count;
        		} else if (count == 1 || nums[i] > max[1]) {
        			max[2] = max[1];
        			max[1] = nums[i];
        			count = ++count == 4 ? 3 : count;
        		} else if (count == 2 || nums[i] > max[2]) {
        			max[2] = nums[i];
        			count = ++count == 4 ? 3 : count;
        		}
        	}
        }
        return count == 3 ? max[2] : max[0];
    }
}
