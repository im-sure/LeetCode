import java.util.Iterator;
import java.util.List;
import java.util.Stack;

public class _341FlattenNestedListIterator implements Iterator<Integer> {
	Stack<NestedInteger> stack = new Stack<NestedInteger>();
	
    public _341FlattenNestedListIterator(List<NestedInteger> nestedList) {
    	for (int i = nestedList.size() - 1; i >= 0; i--) stack.push(nestedList.get(i));
    }

    @Override
    public Integer next() {
    	return stack.pop().getInteger();
    }

    @Override
    public boolean hasNext() {
        while (!stack.isEmpty()) {
        	NestedInteger ni = stack.peek();
        	if (ni.isInteger()) return true;
        	stack.pop();
        	List<NestedInteger> nestedList = ni.getList();
        	for (int i = nestedList.size() - 1; i >= 0; i--) stack.push(nestedList.get(i));
        }
        return false;
    }
}
