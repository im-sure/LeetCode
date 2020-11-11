import java.util.Stack;

public class _0042TrappingRainWater {
  public int trap(int[] height) {
    if (height == null || height.length < 3) {
      return 0;
    }
    int res = 0;
    Stack<Integer> stack = new Stack<>();
    for (int i = 0; i < height.length; i++) {
      int h = height[i];
      if (h == 0) {
        continue;
      }
      int currentH = 0;
      while (!stack.isEmpty()) {
        int index = stack.peek();
        int tmpH = Math.min(h, height[index]);
        res += (i - index - 1) * (tmpH - currentH);
        currentH = tmpH;
        if (height[index] <= h) {
          stack.pop();
        }
        if (height[index] >= h) {
          break;
        }
      }
      stack.push(i);
    }
    return res;
  }
}
