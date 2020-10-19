public class _1041RobotBoundedInCircle {
  public boolean isRobotBounded(String instructions) {
    int direct = 0;
    int x = 0;
    int y = 0;
    for (int i = 0; i < 4; i++) {
      for (int j = 0; j < instructions.length(); j++) {
        char c = instructions.charAt(j);
        if (c == 'G') {
          switch (direct) {
            case 0:
              y += 1;
              break;
            case 1:
              x += 1;
              break;
            case 2:
              y -= 1;
              break;
            case 3:
              x -= 1;
              break;
          }
        } else if (c == 'L') {
          direct -= 1;
          if (direct < 0) {
            direct = 3;
          }
        } else {
          direct += 1;
          if (direct > 3) {
            direct = 0;
          }
        }
      }
      if (x == 0 && y == 0) {
        return true;
      }
    }
    if (x == 0 && y == 0) {
      return true;
    }
    return false;
  }
}
