// can i only use O(1) extra memory?
// is it posiible to receive an empty input ?
// is it possible to receive an array contains negative value?
class Solution {
    public int removeDuplicates(int[] nums) {
            int currentNum = -1000;
    int count = 0;
    for (int i = 0; i < nums.length; i++) {
      if (currentNum == nums[i]) {
        nums[i] = 99999;
        continue;
      }
      currentNum = nums[i];
      count++;
    }

    Arrays.sort(nums);

    return count;
    }
}