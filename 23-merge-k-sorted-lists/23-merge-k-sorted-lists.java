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
        
        PriorityQueue<ListNode> pq=new PriorityQueue<>((a,b)->Integer.compare(a.val,b.val));
        
        for(ListNode node: lists)
            if(node!=null)
            pq.add(node);
        
        ListNode head=new ListNode();
        ListNode dummy=head;
        while(!pq.isEmpty()){
            
            ListNode node=pq.remove();
            
            dummy.next=node;
            dummy=dummy.next;
            
            if(node.next!=null)
                pq.add(node.next);
            
            
        }
        
        return head.next;
        
        
        
        
    }
}