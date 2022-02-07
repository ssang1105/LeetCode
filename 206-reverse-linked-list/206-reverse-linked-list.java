// 23:00

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode reverseList(ListNode head) {
        if (head == null) {
          return null;
        }

        Stack<ListNode> stack = new Stack<>();
        stack.push(head);
        while (head.next != null) {
          head = head.next;
          stack.push(head);
        }

        ListNode result = stack.pop();
        ListNode tmp = result;
        while (!stack.isEmpty()) {
          tmp.next = stack.pop();
          tmp = tmp.next;
        }
        tmp.next = null;

        return result;
    }
}