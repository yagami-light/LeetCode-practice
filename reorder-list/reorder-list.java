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
    public void reorderList(ListNode head) {
        
        reorderListUtil(head);
    }
    
    private ListNode  reorderListUtil(ListNode head){
        if(head==null || head.next==null)
            return head;
        if(head!=null && head.next!=null && head.next.next==null)
            return head;
        
        
        ListNode seocondNode=head.next;
        ListNode thirdNode=head.next.next;
        
        ListNode temp=head;
        ListNode prev=null;
        while(temp.next!=null){
             prev=temp;
            temp=temp.next;
           
            
        }
        
        head.next=temp;
        prev.next=null;
        temp.next=reorderListUtil(seocondNode);
        
        
        
        return head;
        
        
    }
    
}