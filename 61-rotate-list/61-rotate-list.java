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
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null || head.next == null || k==0)
            return head;
        int len = 1;
        ListNode temp = head;
        while(temp.next!=null){
            len++;
            temp = temp.next; 
        }
        
        temp.next = head;
        
        k=k%len;
        int gap = len - k;
        
        ListNode curr = head;
        while(--gap>0){
            curr = curr.next;
        }
        
        head = curr.next;
        curr.next = null;
        
        
        return head;
    }
}