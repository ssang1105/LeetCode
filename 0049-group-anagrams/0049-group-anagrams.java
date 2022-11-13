class Solution {
  public List<List<String>> groupAnagrams(String[] strs) {
    Map<String, List<String>> inspectionMap = new HashMap<>();
    for (String input : strs) {
      char[] inputChars = input.toCharArray();
      Arrays.sort(inputChars);
      String key = String.valueOf(inputChars);
      if (inspectionMap.get(key) == null) {
        List<String> arrayList = new ArrayList<>();
        arrayList.add(input);
        inspectionMap.put(key, arrayList);
      } else {
        List<String> oldList = inspectionMap.get(key);
        oldList.add(input);
      }
    }

    return inspectionMap.values().stream().toList();
  }
}