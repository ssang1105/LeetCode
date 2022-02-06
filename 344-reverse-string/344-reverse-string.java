// 20:25
// q) "s" can be empty? nope
// q) "s" max length? 10^5
// q) "s" only english? yes

class Solution {
    public void reverseString(char[] s) {
         for (int i = 0; i < s.length / 2; i++) {
          char tmp = s[i];
          s[i] = s[s.length - 1 - i];
          s[s.length - 1 - i] = tmp;
        }
        
    }
}