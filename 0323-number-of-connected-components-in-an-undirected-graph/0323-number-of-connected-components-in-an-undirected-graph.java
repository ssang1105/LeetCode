// 22:43

import java.util.Map.Entry;

class Solution {
  public int countComponents(int n, int[][] edges) {
    int componentsCount = 0;

    Map<Integer, List<Integer>> edgeMap = new HashMap<>();
    for (int i = 0; i < n; i++) {
      edgeMap.put(i, new ArrayList<>());
    }
    for (int[] edge : edges) {
      edgeMap.get(edge[0]).add(edge[1]);
      edgeMap.get(edge[1]).add(edge[0]);
    }

    Map<Integer, Boolean> visitedMap = new HashMap<>(n);
    for (Entry<Integer, List<Integer>> entry : edgeMap.entrySet()) {
      if (visitedMap.get(entry.getKey()) == null) {
        componentsCount++;
        dfs(edgeMap, visitedMap, entry.getKey());
      }
    }

    return componentsCount;

  }

  private void dfs(Map<Integer, List<Integer>> edgeMap, Map<Integer, Boolean> visitedMap, int currentNode) {
    visitedMap.put(currentNode, true);
    for (int i =0 ; i < edgeMap.get(currentNode).size(); i++) {
      if (visitedMap.get(edgeMap.get(currentNode).get(i)) == null) {
        dfs(edgeMap, visitedMap, edgeMap.get(currentNode).get(i));
      }
    }
  }

}