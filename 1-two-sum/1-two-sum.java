// start : 22:52
// q) "nums" could be empty?
// q) "nums" max length
// q) elment of "nums" and "target" only integer?
// q) n^2 ok?
// q) elment of "nums" only positive?
// end : 23:01
class Solution {
    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
      for (int j = i + 1; j < nums.length; j++) {
        if (nums[i] + nums[j] == target) {
          return new int[]{i, j};
        }
      }
    }
    return null;
    }
}