import java.util.Stack;

public class _232ImplementQueueUsingStacks {
	Stack<Integer> pos = new Stack<Integer>();
	Stack<Integer> neg = new Stack<Integer>();

    public void push(int x) {
    	if (!pos.isEmpty()) while (!pos.isEmpty()) neg.push(pos.pop());
	    neg.push(x);
    }

    public void pop() {
    	if (pos.isEmpty()) while (!neg.isEmpty()) pos.push(neg.pop());
	    pos.pop();
    }

    public int peek() {
    	if (pos.isEmpty()) while (!neg.isEmpty()) pos.push(neg.pop());
	    return pos.peek();
    }

    public boolean empty() {
        return pos.isEmpty() && neg.isEmpty();
    }
}
