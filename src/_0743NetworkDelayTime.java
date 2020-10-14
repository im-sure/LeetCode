public class _0743NetworkDelayTime {
  public int networkDelayTime(int[][] times, int N, int K) {
    int[][] graph = new int[N + 1][N + 1];
    boolean[] closed = new boolean[N + 1];
    for (int i = 0; i <= N; i++) {
      for (int j = 0; j <= N; j++) {
        if (i == j) {
          graph[i][j] = 0;
        } else {
          graph[i][j] = Integer.MAX_VALUE;
        }
      }
    }
    for (int[] time : times) {
      graph[time[0]][time[1]] = time[2];
    }
    while (true) {
      int minIndex = -1;
      int minValue = Integer.MAX_VALUE;
      for (int i = 1; i <= N; i++) {
        if (graph[K][i] < minValue && !closed[i]) {
          minIndex = i;
          minValue = graph[K][i];
        }
      }
      if (minIndex == -1) {
        break;
      }
      closed[minIndex] = true;
      for (int i = 1; i <= N; i ++) {
        if (i == minIndex || graph[minIndex][i] == Integer.MAX_VALUE) {
          continue;
        }
        graph[K][i] = Math.min(graph[K][i], graph[K][minIndex] + graph[minIndex][i]);
      }
    }
    int res = Integer.MIN_VALUE;
    for (int i = 1; i <= N; i ++) {
      if (i == K) {
        continue;
      }
      if (graph[K][i] == Integer.MAX_VALUE) {
        return -1;
      }
      res = Math.max(res, graph[K][i]);
    }
    return res;
  }
}
