// is it possible to pass empty input?
// what is a max length of input? 
// what is a range of columnTitle?
class Solution {
    public int titleToNumber(String columnTitle) {
    // 254 could be broken down as this: (2 x 10 x 10) + (5 x 10) + (4). The reason we use 26 instead of 10 is because 26 is our base.
    // For s = "BCM" the final solution would be (2 x 26 x 26) + (3 x 26) + (13)
    //    "B" = 2
    //    "BC" = (2)26 + 3
    //    "BCM" = (2(26) + 3)26 + 13
    int sum = 0;
    // for each loop so we don't need to mess with index values.
    for (char c : columnTitle.toUpperCase().toCharArray()) {
      sum *= 26;
      sum += c - 'A' + 1;
    }
    return sum;
    }
}