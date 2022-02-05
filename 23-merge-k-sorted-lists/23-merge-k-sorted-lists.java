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
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists == null || lists.length == 0)
            return null;
        int n = lists.length;
        return partition(lists,0,n-1);
    }
    
    ListNode partition(ListNode[] list, int s, int e){
        if(s==e)
            return list[s];
        int mid = s+(e-s)/2;
        ListNode left = partition(list, s, mid);
        ListNode right = partition(list, mid+1, e);
        
        return merge(left,right);
    }
    
    ListNode merge(ListNode left, ListNode right){
        if(left == null)
            return right;
        if(right == null)
            return left;
        
        if(left.val<right.val){
            left.next = merge(left.next, right);
            return left;
        }else{
            right.next = merge(left, right.next);
            return right;
        }
            
    }
}