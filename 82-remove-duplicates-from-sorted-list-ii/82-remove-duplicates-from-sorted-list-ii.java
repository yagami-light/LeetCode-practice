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
        
        return deleteDuplicatesUtil(head);
        
    }
    
    
    private ListNode deleteDuplicatesUtil(ListNode head){
        if(head==null || head.next==null)
            return head;
        
        ListNode temp=head;
        if(temp.val==temp.next.val){
        while(temp.next!=null && temp.val==temp.next.val){
            temp=temp.next;
        }
     
         return deleteDuplicatesUtil(temp.next);   
        }
        
        head.next= deleteDuplicatesUtil(head.next);
        return head;
            
    }
    
}