public class _1094CarPooling {
  public boolean carPooling(int[][] trips, int capacity) {
    int stops = 0;
    for (int[] trip : trips) {
      stops = Math.max(stops, trip[2]);
    }
    int[] up = new int[stops + 1];
    int[] down = new int[stops + 1];
    for (int i = 0; i < trips.length; i++) {
      int[] trip = trips[i];
      up[trip[1]] += trip[0];
      down[trip[2]] += trip[0];
    }
    int persons = 0;
    for (int i = 0; i <= stops; i++) {
      persons -= down[i];
      persons += up[i];
      if (persons > capacity) {
        return false;
      }
    }
    return true;
  }
}
