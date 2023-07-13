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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int remainder = 0;
        ListNode toBeReturned = new ListNode();
        ListNode lastNode = null;

        while (l1 != null || l2 != null || remainder > 0) {
            int sum = 0;

            if (l1 != null && l2 != null) {
                sum = l1.val + l2.val + remainder;
                l1 = l1.next;
                l2 = l2.next;
            } else if (l1 != null) {
                sum = l1.val + remainder;
                l1 = l1.next;
            } else if (l2 != null) {
                sum = l2.val + remainder;
                l2 = l2.next;
            } else {
                sum =+ remainder;
            }

            if (sum > 9) {
                sum -= 10;
                remainder = 1;
            } else {
                remainder = 0;
            }

            if (lastNode == null) {
                toBeReturned.val = sum;
                lastNode = toBeReturned;
            } else {
                ListNode newNode = new ListNode();
                newNode.val = sum;
                lastNode.next = newNode;
                lastNode = newNode;
            }
        }

        return toBeReturned;

    }
}