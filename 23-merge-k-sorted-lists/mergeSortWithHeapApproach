class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<ListNode> minHeap = new PriorityQueue<>(new Comparator<>(){
            @Override
            public int compare(ListNode l1,ListNode l2){
                return l1.val-l2.val;
            }
        });

        for(ListNode node: lists){
            if(node!=null)
                minHeap.add(node);
        }

        ListNode head = null,tail = null;
        while(!minHeap.isEmpty()){
            ListNode cc = minHeap.remove();
            if(head == null){
                head = cc;
                tail = cc;
            }else{
                tail.next = cc;
                tail = cc;
            }
            if(cc.next!=null)
                minHeap.add(cc.next);
        }

        return head;
    }
}
