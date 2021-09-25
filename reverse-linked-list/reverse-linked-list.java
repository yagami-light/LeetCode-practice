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
    public ListNode reverseList(ListNode head) {
     
        return reverseListUtil(head);
    }
    
    
    private ListNode reverseListUtil(ListNode head){
        if(head==null || head.next==null)
           return head;
         
        ListNode  newHead=head;  
           
        ListNode nextNode=head.next;
        
        ListNode reversedNode=reverseListUtil(nextNode);   
        nextNode.next=newHead;
         newHead.next=null;   
           
        return  reversedNode;  
        
        
    }
}