// 21:42
// map
// 21:48
import java.util.*;

class Solution {
    public int majorityElement(int[] nums) {
        
    Map<Integer, Integer> map = new HashMap<>();
    for (int i = 0; i < nums.length; i++) {
      if (map.get(nums[i]) == null) {
        map.put(nums[i], 1);
      } else {
        map.put(nums[i], map.get(nums[i]) + 1);
      }
    }
    
    return map.entrySet().stream()
        .max(Comparator.comparing(aa -> aa.getValue()))
        .orElseThrow()
        .getKey();
    }
}