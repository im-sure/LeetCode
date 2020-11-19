public class _0322CoinChange {
  public int coinChange(int[] coins, int amount) {
    if (amount == 0) {
      return 0;
    }
    int[] amounts = new int[amount + 1];
    amounts[0] = 0;
    for (int i = 1; i <= amount; i++) {
      for (int coin : coins) {
        if (i == coin) {
          amounts[i] = 1;
        } else if (i > coin && amounts[i - coin] > 0) {
          amounts[i] = amounts[i] == 0 ? amounts[i - coin] + 1 : Math.min(amounts[i], amounts[i - coin] + 1);
        }
      }
    }
    return amounts[amount] == 0 ? -1 : amounts[amount];
  }
}
