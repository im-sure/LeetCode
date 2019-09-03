import java.util.ArrayList;
import java.util.List;

public class _0155MinStack {
	int size;
	List<Integer> list;
	int min;
	
    public _0155MinStack() {
        size = 0;
        list = new ArrayList<Integer>();
        min = Integer.MAX_VALUE;
    }
    
    public void push(int x) {
    	if (x < min) min = x;
        list.add(x);
        size++;
    }
    
    public void pop() {
    	if (min == list.remove(size-- - 1)) {
    		min = Integer.MAX_VALUE;
			for (int i = 0; i < size; i++) {
				if (min > list.get(i)) min = list.get(i);
			}
    	}
    }
    
    public int top() {
        return list.get(size - 1);
    }
    
    public int getMin() {
    	return min;
    }
}
