import java.util.Stack;

public class _0306AdditiveNumber {
  public boolean isAdditiveNumber(String num) {
    Stack<String> stack = new Stack<>();
    return dfs(stack, num, 0);
  }

  private boolean dfs(Stack<String> stack, String num, int start) {
    for (int i = start; i < num.length(); i++) {
      if (num.charAt(start) == '0' && i > start) {
        return false;
      }
      stack.push(num.substring(start, i + 1));
      if (stack.size() >= 3) {
        if (stack.peek().equals(addStrings(stack.get(stack.size() - 2), stack.get(stack.size() - 3)))) {
          if (i == num.length() - 1) {
            stack.pop();
            return true;
          } else if (dfs(stack, num, i + 1)) {
            stack.pop();
            return true;
          }
        } else if (i == num.length() - 1) {
          stack.pop();
          return false;
        }
      } else if (i == num.length() - 1) {
        stack.pop();
        return false;
      } else if (dfs(stack, num, i + 1)) {
        stack.pop();
        return true;
      }
      stack.pop();
    }
    return false;
  }

  private String addStrings(String s1, String s2) {
    int i = s1.length() - 1;
    int j = s2.length() - 1;
    int c = 0;
    StringBuilder sb = new StringBuilder();
    while(i >= 0 || j >= 0) {
      int n = i >= 0 ? s1.charAt(i--) - '0' : 0;
      int m = j >= 0 ? s2.charAt(j--) - '0' : 0;
      int sum = n + m + c;
      c = sum / 10;
      sb.append(String.valueOf(sum % 10));
    }
    if (c != 0) {
      sb.append(String.valueOf(c));
    }
    return sb.reverse().toString();
  }
}
