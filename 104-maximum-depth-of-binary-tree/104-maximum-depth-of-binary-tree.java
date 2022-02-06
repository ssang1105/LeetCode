// 19:04
// Q) 꼮 DFS 를 써야하려나?
// TreeNode 를 사용해야하니깐 쓰는 방향으로 가야겠다.


/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
  public int maxDepth(TreeNode root) {
    return dfs(root, 0);
  }

  private int dfs(TreeNode node, int currentDepth) {
    if (node == null) {
      return currentDepth;
    }

    return Math.max(dfs(node.left, currentDepth +1), dfs(node.right, currentDepth + 1));
  }
}