import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

// 21:02
// q)
class Solution {
    public int singleNumber(int[] nums) {
        
    Map<Integer, Boolean> map = new HashMap<>();
    for (int i = 0; i < nums.length; i++) {
      if (map.containsKey(nums[i])) {
        map.put(nums[i], false);
      } else {
        map.put(nums[i], true);
      }
    }
    return map.entrySet().stream()
        .filter(Entry::getValue)
        .map(Entry::getKey)
        .findFirst().orElseThrow();
        
    }
}