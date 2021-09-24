import java.util.Stack;

public class _0071SimplifyPath {
  public String simplifyPath(String path) {
    String[] parts = path.split("/");
    Stack<String> stack = new Stack<>();
    for (String part : parts) {
      if (part.isEmpty()) {
        continue;
      } else if (part.equals(".")) {
        continue;
      } else if (part.equals("..")) {
        if (!stack.isEmpty()) {
          stack.pop();
        }
      } else {
        stack.push(part);
      }
    }
    StringBuilder sb = new StringBuilder();
    for (String part : stack) {
      sb.append('/');
      sb.append(part);
    }
    if (sb.length() == 0) {
      sb.append('/');
    }
    return sb.toString();
  }
}
