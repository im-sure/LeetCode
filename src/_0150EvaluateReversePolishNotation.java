import java.util.Stack;

public class _0150EvaluateReversePolishNotation {
  public int evalRPN(String[] tokens) {
    Stack<Integer> stack = new Stack<>();
    for (String token : tokens) {
      switch (token) {
        case "+":
          int arg1 = stack.pop();
          int arg2 = stack.pop();
          stack.push(arg2 + arg1);
          break;
        case "-":
          arg1 = stack.pop();
          arg2 = stack.pop();
          stack.push(arg2 - arg1);
          break;
        case "*":
          arg1 = stack.pop();
          arg2 = stack.pop();
          stack.push(arg2 * arg1);
          break;
        case "/":
          arg1 = stack.pop();
          arg2 = stack.pop();
          stack.push(arg2 / arg1);
          break;
        default:
          stack.push(Integer.valueOf(token));
          break;
      }
    }
    return stack.pop();
  }
}
