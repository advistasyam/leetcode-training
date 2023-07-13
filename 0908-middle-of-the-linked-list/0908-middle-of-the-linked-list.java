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
    public ListNode middleNode(ListNode head) {
        int listSize = 1;
        ListNode loop = head;
        while (true) {
            if (loop.next != null) {
                listSize++;
                loop = loop.next;
            } else {
                break;
            }
        }

        int middle = (int) Math.ceil(listSize / 2);

        ListNode toBeReturned = head;

        for (int i = 0; i < middle; i++) {
            toBeReturned = toBeReturned.next;
        }

        return toBeReturned;
    }
}