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
    public ListNode reverseKGroup(ListNode head, int k) {
        if(head==null || head.next==null || k==1) return head;
        
        ListNode dummyHead=new ListNode(-1);
        dummyHead.next=head;
        ListNode begin=dummyHead;
        int i=0;
        while(head!=null){
            i++;
            if(i%k==0){
                
                begin=reverse(begin,head.next);
                head=begin.next;
                
                
            }else{
                
                head=head.next;
                
                
            }
            
            
            
        }
        
        return dummyHead.next;
        
        
        
        
        
    }
    private ListNode reverse(ListNode begin,ListNode end ){
        
        ListNode first=begin.next;
        ListNode curr=begin.next;
        ListNode prev=begin;
        
        while(curr!=end){
            
           ListNode  next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
            
            
        }
        
        first.next=curr;
        begin.next=prev;
        
        return first;
        
        
    }
    
    
    
    
}