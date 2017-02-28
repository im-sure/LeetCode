import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class _380InsertDeleteGetRandomO1 {
	Random random;
	Set<Integer> set;
	
    public _380InsertDeleteGetRandomO1() {
        random = new Random();
        set = new HashSet<Integer>();
    }
    
    public boolean insert(int val) {
        return set.add(val);
    }
    
    public boolean remove(int val) {
        return set.remove(val);
    }
    
    public int getRandom() {
        return (Integer)set.toArray()[random.nextInt(set.size())];
    }
}
