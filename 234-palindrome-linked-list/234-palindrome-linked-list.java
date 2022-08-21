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
    public boolean isPalindrome(ListNode head) {
        if(head==null || head.next==null) return true;
        
       ListNode fast=head;
       ListNode slow=head;
    ListNode prev=null;
       while(fast!=null && fast.next!=null){
           
           fast=fast.next.next;
             prev=slow;
           slow=slow.next;
         
       }
        prev.next=null;
        
       ListNode temp1=head;
    ListNode    temp2=reverse(slow);
        while(temp1!=null){
            if(temp1==null  && temp2==null) return true;
            if(temp1==null || temp2==null) {
                System.out.println(" failing ...");
                // System.out.println(" temp 1 :"+temp1 == null ? "null":temp1.val);
                // System.out.println(" temp 2 :"+temp2 == null ? "null":temp2.val);

                return false;
                
            }
            // System.out.println("temp1 val :"+temp1.val + " temp2 val : "+temp2.val);
            if(temp1.val ==temp2.val){
                temp1=temp1.next;
                temp2=temp2.next;
            }else{
                return false;
            }
        }
        
        return true;
        
    }
    
    private ListNode reverse(ListNode head){
        if(head==null || head.next==null) return head;
        
        ListNode secondReverse=reverse(head.next);
        head.next.next=head;
        head.next=null;
        return secondReverse;
        
    }
    
}