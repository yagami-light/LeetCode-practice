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
        PriorityQueue<ListNode> pq=new PriorityQueue(Comparator.comparing((ListNode l)->l.val));
        
        for(ListNode node:lists){
            if(node!=null)
            pq.add(node);
            
        }
        
        ListNode newHead=new ListNode();
        ListNode temp=newHead;
        while(!pq.isEmpty()){
            ListNode node=pq.remove();
            temp.next=node;
            temp=temp.next;
            if(node.next!=null)
                pq.add(node.next);
            
            
        }
        
        
        return newHead.next;
        
    }
}