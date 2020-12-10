import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.Stack;

public class _0207CourseSchedule {
  public boolean canFinish(int numCourses, int[][] prerequisites) {
    Map<Integer, Set<Integer>> deps = new HashMap<>();
    for (int[] prerequisite : prerequisites) {
      int target = prerequisite[0];
      int dep = prerequisite[1];
      Stack<Set<Integer>> stack = new Stack<>();
      if (deps.containsKey(dep)) {
        stack.push(deps.get(dep));
      }
      while (!stack.isEmpty()) {
        Set<Integer> set = stack.pop();
        if (set.contains(target)) {
          return false;
        }
        for (Integer i : set) {
          if (deps.containsKey(i)) {
            stack.push(deps.get(i));
          }
        }
      }
      if (!deps.containsKey(target)) {
        deps.put(target, new HashSet<>());
      }
      deps.get(target).add(dep);
    }
    return true;
  }
}
