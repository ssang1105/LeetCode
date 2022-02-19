// 00:53

class Solution {
    
    int[] visited;
    
    public List<List<Integer>> permute(int[] nums) {
        visited = new int[nums.length];

        List<List<Integer>> results = new ArrayList<>();

        dfs(nums, new ArrayList<>(), results);
        return results;
    }
    
    private void dfs(int[] nums, List<Integer> candidates, List<List<Integer>> results) {
        if (candidates.size() == nums.length) {
          results.add(new ArrayList<>(candidates));
          return;
        }

        for (int i = 0; i < nums.length; i++) {
          if (visited[i] == 1) {
            continue;
          }

          visited[i] = 1;
          candidates.add(nums[i]);
          dfs(nums, candidates, results);
          candidates.remove(candidates.size() - 1);
          visited[i] = 0;
        }

    }

}