// 12:03
// Q)
// * Can I get an empty value in the input?
// * Can i get any other inputs except brackets?
// * Can i use Stack library? 
class Solution {
    public boolean isValid(String s) {
   if (s.length() < 1) {
      return false;
    }
    Deque<Character> stack = new ArrayDeque<>();
    for (char character : s.toCharArray()) {
      if (character == '(' || character == '{' || character == '[') {
        stack.push(character);
      }
       else if (character == ')') {
        if (stack.isEmpty()) {
          return false;
        }
        char charInStack = stack.pop();
        if (charInStack != '(') {
          return false;
        }
      } else if (character == '}') {
        if (stack.isEmpty()) {
          return false;
        }
        char charInStack = stack.pop();
        if (charInStack != '{') {
          return false;
        }
      } else if (character == ']') {
        if (stack.isEmpty()) {
          return false;
        }
        char charInStack = stack.pop();
        if (charInStack != '[') {
          return false;
        }
      }
    }

    return stack.isEmpty();
    }
}