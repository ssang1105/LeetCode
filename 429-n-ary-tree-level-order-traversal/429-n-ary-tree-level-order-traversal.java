// 00:55
// queue
//
/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    public List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> result = new ArrayList<>();
    if (root == null) {
      return result;
    }

    Queue<Node> queue = new LinkedList<>();
    queue.add(root);

        while (!queue.isEmpty()) {
      List<Integer> nLevelValues = new ArrayList<>();
      int size = queue.size();
      for (int i = 0; i < size; i++) {
        nLevelValues.add(queue.peek().val);
        queue.addAll(queue.poll().children);
      }
      result.add(nLevelValues);
    }

    return result;
    }
}