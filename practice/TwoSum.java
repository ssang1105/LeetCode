package practice;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {

  public static void main(String[] args) {

    System.out.println(Arrays.toString(twoSum(new int[]{2, 7, 11, 15}, 9))); // 0, 1
    System.out.println(Arrays.toString(twoSum(new int[]{3, 2, 4}, 6))); // 1, 2
    System.out.println(Arrays.toString(twoSum(new int[]{3, 3}, 6))); // 0, 1


  }

  public static int[] twoSum(int[] nums, int target) {
    Map<Integer, Integer> map = new HashMap<>();
    for (int i = 0; i < nums.length; i++) {
      int remainder = target - nums[i];
      if (map.containsKey(remainder)) {
        return new int[] { map.get(remainder), i };
      }
      map.put(nums[i], i);
    }
    throw new IllegalArgumentException();
  }
}
