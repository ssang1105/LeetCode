class Solution {
      public int[][] flipAndInvertImage(int[][] image) {

    int[][] result = new int[image.length][image.length];
    for (int i = 0; i < image.length; i++) {
      int k = 0;
      for (int j = image.length - 1; j >= 0; j--) {
        result[i][k++] = reverse(image[i][j]);
      }
    }
    return result;
  }

  private int reverse(int num) {
    if (num == 0) {
      return 1;
    } else {
      return 0;
    }
  }
}