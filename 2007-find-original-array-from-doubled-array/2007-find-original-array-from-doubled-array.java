class Solution {
    public int[] findOriginalArray(int[] changed) {

        if (changed.length % 2 != 0) {
      return new int[0];
    }
        Arrays.sort(changed);
        Map<Integer, Integer> map = new HashMap<>();
        int[] results = new int[changed.length / 2];
        int index = 0;
        for (int i = changed.length - 1; i >= 0; i--) {
          int twice = changed[i] * 2;
          if (map.containsKey(twice)) {
            if (map.get(twice) == 1) {
              map.remove(twice);
            } else {
              map.put(twice, map.get(twice) - 1);
            }
            results[index++] = changed[i];
          } else {
            map.put(changed[i], map.getOrDefault(changed[i], 0) + 1);
          }
        }
        return index == changed.length / 2 ? results : new int[]{};
    }
}