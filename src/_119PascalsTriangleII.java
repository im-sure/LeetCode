import java.util.ArrayList;
import java.util.List;

public class _119PascalsTriangleII {
    public List<Integer> getRow(int rowIndex) {
    	int[] lastRow = {1};
        for (int i = 0; i < rowIndex; i++) {
        	int[] newRow = new int[i + 2];
    		for (int j = 0; j < i + 2; j++) {
    			if (j == 0 || j == i + 1) newRow[j] = 1;
    			else newRow[j] = lastRow[j - 1] + lastRow[j];
    		}
        	lastRow = newRow;
        }
    	List<Integer> list = new ArrayList<Integer>();
    	for (int j : lastRow) list.add(j);
        return list;
    }
}
