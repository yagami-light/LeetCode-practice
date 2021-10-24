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
        ListNode prev=new ListNode();
        
       
        return deleteDuplicatesUtil(head);
        
    }
    
    
    private ListNode deleteDuplicatesUtil(ListNode head){
        if(head==null|| head.next==null)
            return head;
       
        
        head.next=deleteDuplicatesUtil(head.next);
        
        return head.val==head.next.val ? head.next : head;
        
    }
    
}