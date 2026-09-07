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
    public int[] nextLargerNodes(ListNode head) {
        int n = 0;
        ListNode temp = head;
        while (temp != null) {
            n++;
            temp = temp.next;
        }
        int[] ans = new int[n];
        ListNode curr = head;
        for (int i = 0; i < n; i++) {
            ListNode next = curr.next;
            while (next != null) {
                if (next.val > curr.val) {
                    ans[i] = next.val;
                    break;
                }
                next = next.next;
            }
            curr = curr.next;
        }
        return ans;
    }
}