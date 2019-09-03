import java.util.ArrayList;
import java.util.List;

public class _0118PascalsTriangle {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> list = new ArrayList<List<Integer>>();
        int[] lastRow = null;
        for (int i = 0; i < numRows; i++) {
        	int[] newRow = new int[i + 1];
        	if (lastRow == null) newRow[0] = 1;
        	else {
        		for (int j = 0; j < i + 1; j++) {
        			if (j == 0 || j == i) newRow[j] = 1;
        			else newRow[j] = lastRow[j - 1] + lastRow[j];
        		}
        	}
        	lastRow = newRow;
        	List<Integer> newList = new ArrayList<Integer>();
        	for (int j : newRow) newList.add(j);
        	list.add(newList);
        }
        return list;
    }
}
