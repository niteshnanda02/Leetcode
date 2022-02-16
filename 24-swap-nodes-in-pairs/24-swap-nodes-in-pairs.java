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
    public ListNode swapPairs(ListNode head) {
        ListNode d = new ListNode(0);
        d.next = head;
        ListNode curr = d;
        while(curr.next!=null&&curr.next.next!=null){
            ListNode f = curr.next;
            ListNode s = curr.next.next;
            f.next = s.next;
            s.next = f;
            curr.next = s;
            curr = curr.next.next;
        }
        return d.next;
    }
}