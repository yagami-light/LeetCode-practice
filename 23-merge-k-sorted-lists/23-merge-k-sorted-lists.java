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
        if(lists.length==0)
            return null;
        PriorityQueue<ListNode> pq=new PriorityQueue(lists.length,Comparator.comparing((ListNode node)->node.val));
        
        for(ListNode node: lists){
           if(node!=null)
            pq.add(node);
        }
        
        ListNode head=new ListNode();
        ListNode temp=head;
        
        while(!pq.isEmpty()){
            ListNode node=pq.remove();
            temp.next=node;
            temp=node;
            if(node.next!=null)
                pq.add(node.next);
            
        }
        
        
        return head.next;
        
        
    }
}