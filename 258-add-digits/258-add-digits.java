class Solution {
    public int addDigits(int num) {
            String numString = String.valueOf(num);

    while (numString.length() > 1) {
      int sum = 0;
      for (char c : numString.toCharArray()) {
        sum += c - '0';
      }
      numString = String.valueOf(sum);
    }

    return Integer.parseInt(numString);
    }
}