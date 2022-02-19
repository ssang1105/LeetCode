// 16:08
// q
// nums empty? min/max length? unique?
// empty subset

class Solution {
    
  public List<List<Integer>> subsets(int[] nums) {

    List<List<Integer>> results = new ArrayList<>();
    backtracking(nums, new ArrayList<>(), results, 0);
    return results;
  }

  private void backtracking(int[] nums, List<Integer> candidates, List<List<Integer>> results, int start) {
     results.add(new ArrayList<>(candidates));
    for (int i = start; i < nums.length; i++) {
      candidates.add(nums[i]);
      backtracking(nums, candidates, results, i + 1);
      candidates.remove(candidates.size() - 1);
    }


  }
}