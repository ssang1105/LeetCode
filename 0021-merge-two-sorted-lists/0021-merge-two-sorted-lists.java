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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
      
        ListNode result = new ListNode();
        ListNode handler = result;
        while (list1 != null && list2 != null) {
          handler.next = new ListNode();
          if (list1.val <= list2.val) {
            handler.next.val = list1.val;
            list1 = list1.next;
          } else {
            handler.next.val = list2.val;
            list2 = list2.next;
          }
          handler=handler.next;
        }

        while (list1 != null) {
          handler.next = new ListNode(list1.val);
          list1 = list1.next;
            handler = handler.next;
        }
        while (list2 != null) {
          handler.next = new ListNode(list2.val);
          list2 = list2.next;
            handler = handler.next;
        }

        return result.next;
        }
}