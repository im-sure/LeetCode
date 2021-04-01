public class _0507PerfectNumber {
  public boolean checkPerfectNumber(int num) {
    if (num == 1) {
      return false;
    }
    int total = 0;
    for (int i = 1; i <= (int) Math.sqrt(num); i++) {
      if (num % i == 0 ) {
        int quotient = num / i;
        total += i;
        if (i != 1 && quotient > i) {
          total += quotient;
        }
      }
    }
    return total == num;
  }
}
