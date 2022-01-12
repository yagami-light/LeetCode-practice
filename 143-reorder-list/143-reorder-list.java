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
       reOrderListUtil(head);
        
    }
    
    private ListNode reOrderListUtil(ListNode head){
        if(head==null || head.next==null || (head!=null && head.next!=null && head.next.next==null))
            return head;
        
        ListNode firstNode=head;
        ListNode secondNode=head.next;
        ListNode temp=head;
        ListNode prev=null;
        while(temp.next!=null){
            prev=temp;
            temp=temp.next;
        }
            
            
        firstNode.next=temp;
        prev.next=null;
        temp.next=reOrderListUtil(secondNode);
        
        // ListNode reOrderedList=
        
        // firstNode.next=reOrderedList;
        
        return firstNode;
        
        
    }
    
    
}