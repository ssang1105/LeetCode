// 0 to n-1 
// 
class Solution {
  public List<List<Integer>> allPathsSourceTarget(int[][] graph) {

    List<List<Integer>> results = new ArrayList<>();
    List<Integer> currents = new ArrayList<>();
    currents.add(0);
    dfs(graph, results, currents, 0);
    return results;
  }

      private void dfs(int[][] graph, List<List<Integer>> results, List<Integer> currents, int current) {
    if (current == graph.length-1) {
      results.add(new ArrayList<>(currents));
    } else {
      for (int node : graph[current]) {
        currents.add(node);
        dfs(graph, results, currents, node);
        currents.remove(currents.size()-1);
      }
    }
  }

}