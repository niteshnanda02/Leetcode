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
    public ListNode deleteDuplicates(ListNode head) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode prev = dummy, pres = head;
        
        while(pres!=null){
            while(pres.next!=null && pres.val == pres.next.val)
                pres = pres.next;
            
            if(prev.next == pres)
                prev = prev.next;
            else{
                prev.next = pres.next;
            }
            pres = pres.next;
        }
        
        return dummy.next;
    }
}