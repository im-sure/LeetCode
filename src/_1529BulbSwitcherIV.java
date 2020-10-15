public class _1529BulbSwitcherIV {
  public int minFlips(String target) {
    char c = '0';
    int step = 0;
    for (int i = 0; i < target.length(); i++) {
      char ch = target.charAt(i);
      if (ch != c) {
        step += 1;
        if (c == '0') {
          c = '1';
        } else {
          c = '0';
        }
      }
    }
    return step;
  }
}
