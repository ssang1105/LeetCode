// 1

class Solution {
    public int maxArea(int[] height) {

    // 무식하게 풀어보았지만 실패 ..
//    int maxArea = 0;
//    for (int i = 1; i < height.length + 1; i++) {
//      for (int j = i; j > 0 && i < height.length; j--) {
//        int areaWidth = j;
//        int areaHeight = Math.min(height[i], height[i - j]);
//        int area = areaWidth * areaHeight;
//        if (area > maxArea) {
//          maxArea = area;
//        }
//      }
//    }
//
//    return maxArea;

    // Discussion 에서 힌트를 얻은 후
    int left = 0;
    int right = height.length - 1;
    int maxArea = 0;
    while (left < right) {
      maxArea = Math.max(maxArea, (Math.min(height[left], height[right]) * (right - left)));
      if (height[left] < height[right]) {
        left++;
      } else {
        right--;
      }
    }

    return maxArea;        
        
    }
}