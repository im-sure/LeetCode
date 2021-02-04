public class _0134GasStation {
  public int canCompleteCircuit(int[] gas, int[] cost) {
    int neg = 0;
    int sum = 0;
    int index = -1;
    for (int i = 0; i < gas.length; i++) {
      int val = gas[i] - cost[i];
      sum += val;
      if (sum < 0) {
        neg += sum;
        index = -1;
        sum = 0;
      } else if (index == -1) {
        index = i;
      }
    }
    if (neg + sum < 0) {
      index = -1;
    }
    return index;
  }
}
