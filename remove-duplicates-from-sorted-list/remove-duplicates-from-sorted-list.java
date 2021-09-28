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
        
        
        return deleteDupUtil(head);
        
    }
    
    private ListNode deleteDupUtil(ListNode head){
        
        if(head==null || head.next==null)
            return head;
        
        
        
        if(head.next.val ==head.val){
            return deleteDupUtil(head.next);
        }
        
        head.next=deleteDupUtil(head.next);
        return head;
        
        
    }
    
}