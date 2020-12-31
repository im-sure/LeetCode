import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class _0146LRUCache {
  private final int capacity;
  private Map<Integer, Integer> map = new HashMap<>();
  private Deque<Integer> deque = new LinkedList<>();

  public _0146LRUCache(int capacity) {
    this.capacity = capacity;
  }
  
  public int get(int key) {
    if (map.containsKey(key)) {
      deque.remove(key);
      deque.add(key);
    }
    return map.getOrDefault(key, -1);
  }
  
  public void put(int key, int value) {
    if (!map.containsKey(key)) {
      if (map.size() == capacity) {
        int oldest = deque.removeFirst();
        map.remove(oldest);
      }
    } else {
      deque.remove(key);
    }
    map.put(key, value);
    deque.add(key);
  }
}
