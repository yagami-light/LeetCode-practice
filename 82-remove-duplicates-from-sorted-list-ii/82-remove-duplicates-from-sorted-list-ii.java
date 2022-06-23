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
       
        ListNode prev=new ListNode(-1);
        prev.next=head;
        ListNode curr=head;
         ListNode dummy=prev;
        boolean equal=false;
        while(curr!=null && curr.next!=null){
            
            while(curr.next!=null && curr.val==curr.next.val){
                equal=true;
                curr=curr.next;
            }
            
            if(equal){
                prev.next=curr.next;
                equal=false;
                
            }else{
                
                prev=curr;
                
                
            }
            
            
            curr=curr.next;
            
        }
        
        
        return dummy.next;
        
        
        
        
    }
}