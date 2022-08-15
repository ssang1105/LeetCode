class Solution {
    public String longestCommonPrefix(String[] strs) {
        String result = "";

    String standard = strs[0];
    for (int i = 0; i < standard.length(); i++) {
      char standardChar = standard.charAt(i);
      boolean isSame = false;
      for (int j = 0; j < strs.length; j++) {
 if (strs[j].length() <= i) {
          break;
        }
        if (strs[j].charAt(i) == standardChar) {
          isSame = true;
        } else {
          isSame = false;
          break;
        }

        if (j == strs.length -1) {
          result += standardChar;
        }
      }
      if (!isSame) {
         break;
      }
    }
    return result;
    }
}