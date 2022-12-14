class Solution {
    public int minimumOperations(int[] nums) {
        int count = 0;
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
          if (nums[i] > 0) {
            count++;
            int target = nums[i];
            for (int j = 0; j < nums.length; j++) {
              if (nums[j] - target >= 0) {
                nums[j] -= target;
              } else {
                nums[j] = 0;
              }
            }
          }
        }
        return count; 
    }
}