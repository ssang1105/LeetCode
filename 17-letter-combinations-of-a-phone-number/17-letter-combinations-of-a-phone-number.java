class Solution {
    public List<String> letterCombinations(String digits) {
     Queue<String> queue = new LinkedList<>();
    for (char character : digits.toCharArray()) {
      if (character == '2') {
        queue.add("abc");
      } else if (character == '3') {
        queue.add("def");
      } else if (character == '4') {
        queue.add("ghi");
      } else if (character == '5') {
        queue.add("jkl");
      } else if (character == '6') {
        queue.add("mno");
      } else if (character == '7') {
        queue.add("pqrs");
      } else if (character == '8') {
        queue.add("tuv");
      } else if (character == '9') {
        queue.add("wxyz");
      }
    }
    if (queue.isEmpty()) {
      return List.of();
    }

    String first = queue.poll();
    List<String> results = first.chars()
        .mapToObj(c -> (char) c)
        .map(Object::toString)
        .toList();

    while (!queue.isEmpty()) {
      String popped = queue.poll();
      List<String> tempResults = new ArrayList<>();
      for (String currentResult : results) {
        for (char c : popped.toCharArray()) {
          tempResults.add(currentResult + c);
        }
      }
      results = tempResults;
    }

    return results;   
    }
}