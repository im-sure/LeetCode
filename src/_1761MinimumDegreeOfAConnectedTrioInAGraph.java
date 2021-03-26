import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class _1761MinimumDegreeOfAConnectedTrioInAGraph {
  public int minTrioDegree(int n, int[][] edges) {
    Map<Integer, Set<Integer>> edgeMap = new HashMap<>();
    for (int[] edge : edges) {
      if (!edgeMap.containsKey(edge[0])) {
        edgeMap.put(edge[0], new HashSet<>());
      }
      edgeMap.get(edge[0]).add(edge[1]);
      if (!edgeMap.containsKey(edge[1])) {
        edgeMap.put(edge[1], new HashSet<>());
      }
      edgeMap.get(edge[1]).add(edge[0]);
    }
    List<Integer> nodes = new ArrayList<>(edgeMap.keySet());
    if (nodes.size() < 3) {
      return -1;
    }
    Collections.sort(nodes, new Comparator<Integer>(){
      public int compare(Integer n1, Integer n2) {
        return edgeMap.get(n1).size() - edgeMap.get(n2).size();
      }
    });
    int min = -1;
    for (int i = 0; i < nodes.size() - 2; i++) {
      int n1 = nodes.get(i);
      if (edgeMap.get(n1).size() < 2) {
        continue;
      }
      for (int j = i + 1; j < nodes.size() - 1; j++) {
        int n2 = nodes.get(j);
        if (edgeMap.get(n2).size() < 2) {
          continue;
        }
        for (int k = j + 1; k < nodes.size(); k++) {
          int n3 = nodes.get(k);
          if (edgeMap.get(n3).size() < 2) {
            break;
          }
          if (edgeMap.get(n1).contains(n2) && edgeMap.get(n1).contains(n3) && edgeMap.get(n2).contains(n3)) {
            int degree = edgeMap.get(n1).size() + edgeMap.get(n2).size() + edgeMap.get(n3).size() - 6;
            if (min == -1) {
              min = degree;
            } else {
              min = Math.min(min, degree);
            }
          }
        }
      }
    }
    return min;
  }
}
