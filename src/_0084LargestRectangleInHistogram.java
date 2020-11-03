import java.util.Stack;

public class _0084LargestRectangleInHistogram {
  public int largestRectangleArea(int[] heights) {
    int largestArea = 0;
    Stack<Edge> stack = new Stack<>();
    for (int i = 0; i < heights.length; i++) {
      int height = heights[i];
      Edge tmp = null;
      while (!stack.isEmpty() && stack.peek().height > height) {
        tmp = stack.pop();
      }
      if (stack.isEmpty() || stack.peek().height < height) {
        if (tmp != null) {
          stack.push(new Edge(tmp.index, height));
        } else {
          stack.push(new Edge(i, height));
        }
      }
      for (Edge edge : stack) {
        largestArea = Math.max(largestArea, edge.height * (i - edge.index + 1));
      }
    }
    return largestArea;
  }

  private class Edge {
    private int index;
    private int height;

    Edge(int index, int height) {
      this.index = index;
      this.height = height;
    }
  }
}
