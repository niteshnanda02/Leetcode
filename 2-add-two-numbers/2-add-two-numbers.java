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
        ListNode dummy = new ListNode(0);
        ListNode head = dummy;
        
        int c = 0;
        while(l1!=null||l2!=null){
            int curr = c;
            if(l1!=null){
                curr+=l1.val;
                l1 = l1.next;
            }
            
            if(l2!= null){
                curr+=l2.val;
                l2 = l2.next;
            }
            
            c = curr/10;
            
            head.next = new ListNode(curr%10);
            head = head.next;
        }
        
        if(c>0){
            head.next = new ListNode(c);
        }
        
        return dummy.next;
    }
}