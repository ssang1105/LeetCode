// 17:50 ~ 17:58
// all of keyboard characters are unique?

class Solution {
  public int calculateTime(String keyboard, String word) {
    int result = 0;
    result += Math.abs(-keyboard.indexOf(word.charAt(0)));
    for (int i = 0; i < word.length() - 1; i++) {
      result += Math.abs(keyboard.indexOf(word.charAt(i)) - keyboard.indexOf(word.charAt(i + 1)));
    }
    return result;
  }
}