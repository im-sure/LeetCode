import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class _0210CourseScheduleII {
  public int[] findOrder(int numCourses, int[][] prerequisites) {
    Map<Integer, List<Integer>> deps = new HashMap<>();
    for (int[] prerequisite : prerequisites) {
      if (!deps.containsKey(prerequisite[0])) {
        deps.put(prerequisite[0], new ArrayList<>());
      }
      deps.get(prerequisite[0]).add(prerequisite[1]);
    }
    System.out.println(deps);
    List<Integer> res = new ArrayList<>();
    for (int i = 0; i < numCourses; i++) {
      if (res.contains(i)) {
        continue;
      }
      if (!dfs(deps, i, res, new ArrayList<>(), res.size())) {
        return new int[0];
      }
    }
    int[] array = new int[numCourses];
    for (int i = 0; i < numCourses; i++) {
      array[i] = res.get(i);
    }
    return array;
  }

  private boolean dfs(Map<Integer, List<Integer>> deps, int n, List<Integer> res, List<Integer> cur, int index) {
    res.add(index, n);
    if (!deps.containsKey(n)) {
      return true;
    }
    for (Integer i : deps.get(n)) {
      if (cur.contains(i)) {
        return false;
      }
      if (res.contains(i)) {
        continue;
      }
      cur.add(n);
      if (!dfs(deps, i, res, cur, res.indexOf(n))) {
        return false;
      }
      cur.remove(cur.size() - 1);
    }
    return true;
  }
}
