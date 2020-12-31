import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class LeetCode {
	public static void main(String[] args) {
    _0146LRUCache test = new _0146LRUCache(2);
    test.put(1, 1); // 缓存是 {1=1}
    test.put(2, 2); // 缓存是 {1=1, 2=2}
    System.out.println(test.get(1));    // 返回 1
    test.put(3, 3); // 该操作会使得关键字 2 作废，缓存是 {1=1, 3=3}
    System.out.println(test.get(2));    // 返回 -1 (未找到)
    test.put(4, 4); // 该操作会使得关键字 1 作废，缓存是 {4=4, 3=3}
    System.out.println(test.get(1));    // 返回 -1 (未找到)
    System.out.println(test.get(3));    // 返回 3
    System.out.println(test.get(4));    // 返回 4
	}
}