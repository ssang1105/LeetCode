// 14:46
// negative case
// ends with zero case
// 14:57
// 15:01
// 15: 03
import java.util.Stack;


class Solution {
    public int reverse(int x) {
        String s = String.valueOf(x);
    Stack<Character> stack = new Stack<>();
    boolean isPositive = true;
    for (int i = 0; i < s.length(); i++) {
      if (s.charAt(i) == '-') {
        isPositive = false;
        continue;
      }
      stack.push(s.charAt(i));
    }

    StringBuilder resultStringBuilder = new StringBuilder();
    if (!isPositive) {
      resultStringBuilder.append("-");
    }
    while (!stack.empty()) {
      resultStringBuilder.append(stack.pop());
    }
    
    long result = Long.parseLong(resultStringBuilder.toString());
    if (result > Integer.MAX_VALUE || result < Integer.MIN_VALUE) {
      return 0;
    }
    
    return (int) result;
    }
}