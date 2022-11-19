class Solution {
  public int subsetXORSum(int[] nums) {
    return dfs(0, nums, 0);
  }

  private int dfs(int index, int[] nums, int currentXor) {
    if (index == nums.length) {
      return currentXor;
    } else {
      int includes = dfs(index + 1, nums, currentXor ^ nums[index]);
      int excludes = dfs(index + 1, nums, currentXor);
      return includes + excludes;
    }
  }
}