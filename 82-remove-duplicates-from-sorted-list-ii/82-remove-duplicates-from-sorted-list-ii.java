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
        ListNode pre=new ListNode(-1);
        ListNode dummy=pre;
        pre.next=head;
        ListNode curr=head;
        
        boolean equal=false;
        while(curr!=null && curr.next!=null){
            
            while(curr.next!=null && curr.val==curr.next.val){
                curr=curr.next;
                equal=true;
            }
            
            if(equal){
                pre.next=curr.next;
                equal=false;
            }else{
                pre=curr;
            }
            curr=curr.next;
            
        }
        
        
        return dummy.next;
        
        
        
    }
}