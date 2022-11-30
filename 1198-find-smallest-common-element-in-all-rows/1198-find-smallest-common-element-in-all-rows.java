import java.util.Map.Entry;

class Solution {
    public int smallestCommonElement(int[][] mat) {
        
        int m = mat.length;
        int n = mat[0].length;

        Map<Integer, Integer> frequencyMap = new HashMap<>();
        for (int i = 0; i < m; i++) {
          for (int j = 0; j < n; j++) {
            int current = mat[i][j];
            if (frequencyMap.get(current) == null) {
              frequencyMap.put(current, 1);
            } else {
              frequencyMap.put(current, frequencyMap.get(current) + 1);
            }
          }
        }

        for (Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
          if (entry.getValue() == m) {
            return entry.getKey();
          }
        }
        return -1;
  }
}