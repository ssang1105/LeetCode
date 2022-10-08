// 17:33
// is it possible to pass n zero?
// what is a max number of n?
// can i loop infinitely?

class Solution {
    public boolean isHappy(int n) {
        Set<String> seen = new HashSet<>();
        String numberString = String.valueOf(n);
        seen.add(numberString);
        while (true) {
          int sum = 0;
          for (char c: numberString.toCharArray()) {
            sum += (c - '0') * (c - '0');
          }
          numberString = String.valueOf(sum);
          if (seen.contains(numberString)) {
            break;
          } else {
            seen.add(numberString);
          }
        }

        return numberString.equals("1");
    }
}