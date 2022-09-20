class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> results = new ArrayList<>();
        results.add(List.of(1));
        if (numRows == 1) {
          return results;
        }
        results.add(List.of(1, 1));
        if (numRows == 2) {
          return results;
        }

        for (int i = 2; i < numRows; i++) {
          List<Integer> previousRow = results.get(i - 1);
          List<Integer> newRow = new ArrayList<>();
          newRow.add(1);
          for (int j = 1; j < previousRow.size(); j++) {
            newRow.add(previousRow.get(j-1) + previousRow.get(j));
          }
          newRow.add(1);
          results.add(newRow);
        }

        return results;
    }
}